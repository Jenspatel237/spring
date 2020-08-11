package com.jenish.springdemo;

public class PracticeHappyFortuneService implements PracticeFortuneService
{

	@Override
	public String getFortune()
	{
		return "Today is your lucky Day";
	}

}
