package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=con.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.hashCode());
		Student student1=con.getBean("ob", Student.class);
		System.out.println(student1.hashCode());
		
		Teacher t1=con.getBean("teacher", Teacher.class);
		Teacher t2=con.getBean("teacher", Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
