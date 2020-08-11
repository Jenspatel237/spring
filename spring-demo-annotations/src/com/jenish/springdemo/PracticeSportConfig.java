package com.jenish.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig
{
	@Bean
	public PracticeFortuneService happyFortuneService()
	{
		return new PracticeHappyFortuneService();
	}
	
	@Bean
	public PracticeCoach practiceDemoCoach()
	{
		return new PracticeDemoCoach(happyFortuneService());
	}
}
