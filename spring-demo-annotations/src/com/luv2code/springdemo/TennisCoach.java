package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define default construtoct
	public TennisCoach() {
		System.out.println("Teniss coach inside default constructor");	}
	
	//define init maded
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("do my statup stuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("do my statup stuff");
	}
	
//	// define a setter method
	//setter injection 
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("Teniss coach inside setter");
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley";
	}
	
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
//	@Autowired
//	@Qualifier("happyFortuneService")
//	public void doSomeCrazyThings(FortuneService theFortuneService) {
//		System.out.println("Teniss coach inside Do Some Crazy Things");
//		fortuneService = theFortuneService;
//		
//	}
}
