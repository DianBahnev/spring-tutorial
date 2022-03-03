package com.luv2.code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on bating cage";
	}

	@Override
	public String getDAilyForutne() {
		return fortuneService.getFortune();
	}

}
