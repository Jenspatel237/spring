package com.jenish.springdemo;

public class BaseballCoach implements Coach
{
	
	// Define a private field for the dependency.
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection.
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Spend 20 minutes on batting prectice.";
	}

	@Override
	public String getDailyFortune()
	{
		// use my fortuneService to get fortune.
		return fortuneService.getFortune();
	}
}
