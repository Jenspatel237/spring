package com.jenish.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Swim1Coach implements Coach
{
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout()
	{
		return "Do 20 laps each day";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

	public String getEmail()
	{
		return email;
	}


	public String getTeam()
	{
		return team;
	}


}
