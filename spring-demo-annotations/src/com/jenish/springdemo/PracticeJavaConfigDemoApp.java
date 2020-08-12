package com.jenish.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeJavaConfigDemoApp
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeSportConfig.class);
		
		PracticeCoach thePracticeCoach = context.getBean("practiceDemoCoach", PracticeCoach.class);
		
		System.out.println(thePracticeCoach.getDailyWorkout());
		System.out.println(thePracticeCoach.getDailyFortune());
		
		context.close();

	}

}
