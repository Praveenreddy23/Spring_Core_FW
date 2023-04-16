package com.springframework;

public class Student {
	private int sid;
	private String name;
	private double marks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student(int sid, String name, double marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		System.out.println("Object created");
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
