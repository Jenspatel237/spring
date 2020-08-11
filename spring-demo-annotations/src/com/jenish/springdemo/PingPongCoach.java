package com.jenish.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach
{
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout()
	{
		return "Play pingPong every day.";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

}
