package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// using interface
public class Pepsi implements InitializingBean, DisposableBean{
	private double prize;

	
	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Pepsi [pepsi=" + prize + "]";
	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("pepsi prize was");
	}

	public void destroy() throws Exception {

		System.out.println("Done");
	}
	

}
