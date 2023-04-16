package com.collection_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection_type/config2.xml");
    	Emp emp = context.getBean("emp",Emp.class);
    	System.out.println(emp);
	}

}
