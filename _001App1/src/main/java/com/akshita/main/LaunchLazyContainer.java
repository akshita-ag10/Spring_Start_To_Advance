package com.akshita.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.akshita.service.Coaching;

public class LaunchLazyContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bean factory is outdated , spring boot also uses Application context behind the scene
		
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		//here we do not specify the xml configuration file in the constructor
		
		XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("applicationConfig.xml");
//		reader.loadBeanDefinitions("applicationConfig2.xml");
		//since here we pass the xml config file in this method, we can pass multiple config files unlike ApplicationContext
		
		
		Coaching ch = container.getBean(Coaching.class);
		boolean status = ch.buyTheCourse(9000.00);
		
		if(status)
			System.out.println("Successfully purchased");
		else
			System.out.println("Failed to purchase the course");
	}

}
