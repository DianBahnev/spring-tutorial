package com.luv2.code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method email");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method team");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice fat bowlling for 15 minutes a day.";
	}

	@Override
	public String getDAilyForutne() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
