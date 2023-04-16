package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext c = new ClassPathXmlApplicationContext("com/beanlifecycle/config5.xml");
// Using Xml file
//		Course e = c.getBean("course",Course.class);
//	    System.out.println(e);
////	    registering shut down hook 
//	    c.registerShutdownHook();
	    
////		 Using interface
//		Pepsi p = c.getBean("psp",Pepsi.class);
//	    System.out.println(p);
////	    registering shut down hook 
//	    c.registerShutdownHook();
		
		// Using Annotation
		Example ex = c.getBean("ex",Example.class);
		System.out.println(ex);
		c.registerShutdownHook();
	    
	}

}
