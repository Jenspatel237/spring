package com.jenish.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp
{

	public static void main(String[] args)
	{
		// Read spring config Java  class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		
		// get the bean from spring container 
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
//		Coach demoCoach = context.getBean("demoCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCoach.getEmail());
//		System.out.println(theCoach.getTeam());
//		System.out.println(demoCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
