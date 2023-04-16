package com.constructorInjection;

public class Employee {
 
	private int eid;
	private String name;
	private double esal;
	
	private Dept dept;
	
	
	public Employee(int eid, String name, double esal, Dept dept) {
		
		this.eid = eid;
		this.name = name;
		this.esal = esal;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", esal=" + esal + ", dept=" + dept + "]";
	}
	
	

}
