package com.reference_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/reference_type/config1.xml");
		
		B b = c.getBean("refB", B.class);
		System.out.println(b);
		
		A a = c.getBean("refA", A.class);
		System.out.println(a);
	}

}
