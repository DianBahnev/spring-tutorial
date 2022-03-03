package com.luv2.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load sprint config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext3.xml");
		
		//retive bean from spring
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		context.close();
	}

}
