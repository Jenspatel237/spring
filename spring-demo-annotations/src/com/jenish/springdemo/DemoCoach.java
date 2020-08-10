package com.jenish.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DemoCoach implements Coach
{

	@Override
	public String getDailyWorkout()
	{
		return "Demo Coach daily workout.";
	}

}
