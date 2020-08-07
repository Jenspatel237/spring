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

}
