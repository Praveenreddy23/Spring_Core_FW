package com.autowiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("com/autowiringAnnotation/config6.xml");
	
	Emp e = c.getBean("emp",Emp.class);
	System.out.println(e);
}
}
