package com.progWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.progWithoutXML")
public class JavaConfig {
	
	@Bean
	public Dept getDept() {
		
		return new Dept();
	}

	@Bean("students") //@Bean(getStudent)
	public Student getStudent() {
		// creating a new student object
		Student student = new Student (getDept());
		return student;
	}

}
