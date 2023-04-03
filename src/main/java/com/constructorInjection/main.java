package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	 public static void main(String[] args) 
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("com/constructorInjection/config3.xml");
        Dept d = c.getBean("refDept",Dept.class);
        System.out.println(d);
		Employee e = c.getBean("refEmp", Employee.class);
		System.out.println(e);
	}

}
