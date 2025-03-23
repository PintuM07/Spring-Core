package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		
		Person per=context.getBean("person1", Person.class);
		System.out.println(per);
		System.out.println(per.getFeestructure());
		System.out.println("---------------------------------");
		System.out.println(per.getProp());
	}
	public static void main(char args[]) {
		
	}
}
