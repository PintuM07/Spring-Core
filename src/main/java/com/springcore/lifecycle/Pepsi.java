package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{

	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("taking pepsi");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		
		System.out.println("going to put bottle back to shop after drinking");
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
