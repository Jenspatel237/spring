package com.jenish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp
{

	public static void main(String[] args)
	{
		// Load the spring configuration file
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		CricketCoach theCoach = contex.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout()); 
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// close the contex
		contex.close();
	}

}
