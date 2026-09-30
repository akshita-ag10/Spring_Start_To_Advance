package com.akshita.springBatch.controllers;

import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.JobExecution;
import org.springframework.batch.core.job.parameters.InvalidJobParametersException;
import org.springframework.batch.core.job.parameters.JobParameters;
import org.springframework.batch.core.job.parameters.JobParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.batch.core.launch.*;

//for learning only we are doing everything in controller,
//we should maintain a separate service layer


@RestController
public class CustomerController {

	//since csv file is part of this project only, we need not to go to any endpoint 
	//we need not to call any endpoint
	//internally only it will start it's job
	
	@Autowired
	private Job cJob; //this is coming from config file, so this job is to import customer data

//	@Autowired
//	private JobLauncher jobLauncher;  //it's deprecated in spring Batch 6.x, alternative is JobOperator
	
	@Autowired
	private JobOperator jobOperator;
//	
//	JobExecution execution =
//	        jobOperator.start(cJob, jobParameters);
	
	@GetMapping("/import")
	//the method should be called by itself, adding endpoints for just it in case it did't invoke by itself
	public void loadData() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, InvalidJobParametersException {
		//should handle exception, but just ducking here
		
		JobParameters jobParameter = new JobParametersBuilder()
				.addLong("Starts at ", System.currentTimeMillis())
				.toJobParameters();
		
//		jobLauncher.run(cJob,jobParameter);
		JobExecution execution =
		        jobOperator.start(cJob, jobParameter);
		System.out.println("Data loaded to Database");
	}
	


}
