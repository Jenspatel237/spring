package com.jenish.springdemo;

public class SadFortuneService implements FortuneService
{

	@Override
	public String getFortune()
	{
		return "Today is s sad day.";
	}

}
