package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {

	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.dispaly();
		System.out.println("Student is reading book");
	}
	
}
