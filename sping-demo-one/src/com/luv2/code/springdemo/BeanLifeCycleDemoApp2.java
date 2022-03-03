package com.luv2.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp2 {

	public static void main(String[] args) {
		// load sprint config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		//retive bean from spring
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPonitn tho the same object" + result);
		System.out.println("\nMemory location theCoach" + theCoach);
		System.out.println("\nMemory location alphaCoach" + alphaCoach);
	}

}
