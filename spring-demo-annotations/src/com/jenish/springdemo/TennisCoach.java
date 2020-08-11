package com.jenish.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach
{
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// Define a default constructor
	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside default Constructor");
	}
	
	/*
	@Autowired
	// Define a setter method
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService)
	{
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	*/
	
	
	@Override
	public String getDailyWorkout()
	{
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("inside PostConstuct");
	}
	
	@PreDestroy
	public void doMyDestroyStuff()
	{
		System.out.println("inside PreDestroy");
	}

}
