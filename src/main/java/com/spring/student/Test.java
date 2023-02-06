package com.spring.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) applicationContext.getBean("s");
		System.out.println(student);
	}

}
