package com.multipleconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("com/multipleconstructor/config4.xml");
	
	Addition a = c.getBean("add",Addition.class);
	a.sum();
}
}
