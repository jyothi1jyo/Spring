package com.jyothi.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = context.getBean("student", Student.class);
		s1.displayStudentInfo();
		
		Student s2 = context.getBean("s2", Student.class);
		s2.displayStudentInfo();
		
	}

}
