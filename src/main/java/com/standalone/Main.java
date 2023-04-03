package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("com/standalone/standalone.xml");
		
		Person p = c.getBean("name",Person.class);
		System.out.println("------------List-----------");
		System.out.println(p);
		System.out.println(p.getClass().getName());
		
		System.out.println("------------Map-----------");
		System.out.println(p.getTeam());
		System.out.println(p.getTeam().getClass().getName());
		System.out.println("------------Set-----------");
		System.out.println(p.getDomain());
		System.out.println("------------Properties-----------");
		System.out.println(p.getProp());
		
	}

}
