package com.jenish.springdemo;

public class TrackCoach implements Coach
{
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	public TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()
	{

		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune()
	{
		
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupWork()
	{
		System.out.println("TrackCoach: inside method - doMyStartupWork");
	}
	
	// add a destroy method
	public void doMyCleanupWork()
	{
		System.out.println("TrackCoach: inside method - doMyCleanupWork");
	}
}
