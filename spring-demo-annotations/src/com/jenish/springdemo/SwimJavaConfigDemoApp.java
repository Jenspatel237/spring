package com.jenish.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp
{

	public static void main(String[] args)
	{
		// Read spring config Java  class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		
		// get the bean from spring container 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
//		Coach demoCoach = context.getBean("demoCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
//		System.out.println(demoCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
