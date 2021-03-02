package com.jyothi.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
	public static void main(String[] args) {
//		Sprint s = new Sprint();
//		s.calling();
//		s.data(); 
//		
//		tmobile t = new tmobile();
//		t.calling();
//		t.data();
		
	/*	Sim sim = new tmobile();	//runtime polymorphism -sprint  ---> spring
		sim.calling();
		sim.data();*/
		
		//spring will create objects
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file is loaded");
		
		/*Sprint s1 = (Sprint)context.getBean("sprint");
		s1.calling();
		s1.data();*/
		
		//without type casting
		/*here i am using implemented class variable
		Tmobile t1 = context.getBean("tmobile", Tmobile.class);
		t1.calling();
		t1.data();*/
		
		//interface variable - good practice to not to touch source code
		Sim s1 = context.getBean("sim", Sim.class);
		s1.calling();
		s1.data();
		
	}
 
}
