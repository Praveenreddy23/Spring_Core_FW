package com.progWithoutXML;

import org.springframework.beans.factory.annotation.Value;

//@Component("student")
public class Student {
	
	
	private Dept dName;
	
	
	

	public Student(Dept dName) {
		super();
		this.dName = dName;
		this.dName.display();
		
	}

	@Value("#{new java.lang.String ('Reddy')}")
	private String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public void sName()
	{
		//this.dName.display();
		
		System.out.println("Praveen");
	}
	
}
