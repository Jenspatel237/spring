package com.jenish.springdemo;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.jenish.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig
{
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() 
	{
		return new SwimCoach(sadFortuneService());
	}
	
	
	
	// define a bean for our swim coach AND inject dependency
	
	
}
