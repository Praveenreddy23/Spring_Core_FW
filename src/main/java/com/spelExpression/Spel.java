package com.spelExpression;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.stereotype.*;

@Component("Bean1")
public class Spel {

	@Value("#{ 10+2 }")
	private int a;
	
	@Value("#{ 99>88?8.5:9.5 }")
	private double b;
	
	@Value("#{T(java.lang.Math).sqrt(30)}")
	private double power;
	
	@Value("#{T(java.lang.Math).PI}")
	private double staticVariable;
	
	@Value("#{10 > 5}")
	private boolean c;
	
	@Value("#{new java.lang.String ('Reddy')}")
	private String stringTypeObjectValue;
	
//	@Value("#{new java.util.ArrayList().add('java')}")
//	private List<String> stringTypeList;
	
	@Value("#{pnames}")
	private List<String> stringTypeList;

	@Override
	public String toString() {
		return "Spel [a=" + a + ", b=" + b + ", power=" + power + ", staticVariable=" + staticVariable + ", c=" + c
				+ ", stringTypeObjectValue=" + stringTypeObjectValue + ", stringTypeList=" + stringTypeList + "]";
	}

	
	
	
}
