package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("com/stereotype/stereotype.xml");
		
		Ipl ipl =c.getBean("ipl-2023",Ipl.class);
		System.out.println(ipl);
	}

}
