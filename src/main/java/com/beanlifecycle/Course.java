package com.beanlifecycle;
// using xml file
public class Course {
	private String subName;
	private String subDuration;
	


	public Course() {
		super();
	}


	public String getSubName() {
		return subName;
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	public String getSubDuration() {
		return subDuration;
	}


	public void setSubDuration(String subDuration) {
		this.subDuration = subDuration;
	}
	public void init() {
		System.out.println(" init course started");
	}
	public void destroy() {
		System.out.println(" destroy course ended");
	}


	@Override
	public String toString() {
		return "Exam [subName=" + subName + ", subDuration=" + subDuration + "]";
	}


}
