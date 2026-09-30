package com.akshita.springBatch.config;

import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.Step;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.infrastructure.item.data.RepositoryItemWriter;
import org.springframework.batch.infrastructure.item.file.FlatFileItemReader;
import org.springframework.batch.infrastructure.item.file.LineMapper;
import org.springframework.batch.infrastructure.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.infrastructure.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.infrastructure.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.akshita.springBatch.model.Customer;
import com.akshita.springBatch.repository.CustomerRepo;

@Configuration
public class BatchConfig {
	
	@Autowired
	CustomerRepo repo;	
	@Autowired
	JobRepository jobRepo; //coming from batch dependency	
	@Autowired
	PlatformTransactionManager transactionManager; //coming from batch dependency
	//transaction manager - helps in managing transactions, i.e. either everything should happen or nothing
	//not sure if it manages chunkwise or on whole data
	
	
	//Item Reader
	@Bean
	public FlatFileItemReader<Customer> itemReader(){
		FlatFileItemReader<Customer> reader = new FlatFileItemReader<Customer>(lineMapper());
		reader.setResource(new FileSystemResource("src/main/resources/customer_data_1000.csv"));
		reader.setName("csv-reader"); //giving name is optional 
		reader.setLinesToSkip(1); //because we want to skip no. of lines =1, because our data start after 1 lines, as 1st line is of headers in csv file
		
		reader.setLineMapper(lineMapper());
		//in this setLineMapper we need to tell how to map data to customer obj
		//but if we will specify everything here, it would be complicated in argument, 
		//so are calling lineMapper() method, which is returnig the required details
		
		
		//so for mapping csv to java obj, we need things ( this may change depending upon from where you are reading the data)
		//DefaultLineMapper
		//DelimitedLineTokenizer
		//BeanWrapperFieldSetMapper
		return reader;
	}
	
	private LineMapper<Customer> lineMapper(){
		DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();
		
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		
		lineTokenizer.setDelimiter(",");//since csv files are "," delimited
		lineTokenizer.setStrict(false);//says don't be v strict while reading the data from csv file, if some fields are missing read those also, don't fail or give exception
		lineTokenizer.setNames(
				"customerId",
				"firstName",
				"lastName",
				"email",
				"city",
				"state",
				"country",
				"zipcode"
				
				);//telling which all fields are to be mapped, give customer entity field names here, better to keep headers in csv and fields name same
		
		BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Customer.class);
		
		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(fieldSetMapper);
		return lineMapper;
	}
	
	
	
	//Item Processor
	@Bean
	public CustomerProcessor processCustData() {
		//Spring Batch calls process() method of CustomerProcessor class automatically as part of the batch job execution ( as CustomerProcessor implements ItemProcessor Interface). 
		//we don't need to call it explicitly..
		
		return new CustomerProcessor();
	}
	
	
	//Item Writer
	@Bean
	public RepositoryItemWriter<Customer> itemWriter(){
		
		RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<Customer>(repo);
		writer.setRepository(repo);
		writer.setMethodName("save"); //we want to call save method of repository to save the records in db
		
		return writer;
	}
	
	
	//Step
	//we can have more than one step also in one job
	//for each step there would be separte item reader, processor and writer
	
	@Bean
	public Step step() {
		return new StepBuilder("step-1", jobRepo) //registering  step to jobRepo
				.<Customer, Customer>chunk(50)//specifying chunk size 
				.transactionManager(transactionManager)//should happen with transaction manager
				.reader(itemReader()) //method names for reader, processor and writer
				.processor(processCustData())
				.writer(itemWriter())
				.build();
	}
	
	//Job
	@Bean
	public Job job() {
		return new JobBuilder("customer-import-job", jobRepo)
				.start(step()) //step method name
//				.next(step2()) //if more than one steps, configure them in job like this
				.build();
	}
	
	//Job Launcher
	//will configure it directly in controller layer - want it to be configured automatically

}
