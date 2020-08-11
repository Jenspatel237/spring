package com.jenish.springdemo;

public class PracticeDemoCoach implements PracticeCoach
{

	private PracticeFortuneService practiceFortuneService;
	
	public PracticeDemoCoach(PracticeFortuneService practiceFortuneService)
	{
		this.practiceFortuneService = practiceFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Do Workout Daily.";
	}

	@Override
	public String getDailyFortune()
	{
		return practiceFortuneService.getFortune();
	}

}
