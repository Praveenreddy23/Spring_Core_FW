package com.constructorInjection;

public class Dept {

	private String dname;

	public Dept(String dname) {
		
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [dname=" + dname + "]";
	}
	
}
