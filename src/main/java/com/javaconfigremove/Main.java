package com.javaconfigremove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s = c.getBean("students",Student.class);
		System.out.println(s);
		s.sName();
		
	}

}
