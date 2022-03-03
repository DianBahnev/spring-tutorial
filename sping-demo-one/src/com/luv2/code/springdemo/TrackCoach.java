package com.luv2.code.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	private FortuneService fortuneService;
	
	

	@Override
	public String getDailyWorkout() {
		return "Runa a hard 5k";
	}
	

	@Override
	public String getDAilyForutne() {
		return "Just Do it:" + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach inside method startup method");
	}
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach inside method cleanup method");
	}

}
