package com.jenish.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService
{

	private String fileName = "/home/jenish/git/spring/spring-demo-annotations/src/fortunes.txt";
	private List<String> theFortunes;
	
	// Create random number generator
	private Random myRandom = new Random();
	
	public FileFortuneService()
	{
		File theFile = new File(fileName);
		
		System.out.println("Reading Fortunes from: " + theFile);
		System.out.println("File Exists: "+ theFile.exists());
		
		// Initialize the array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from the file
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(theFile));
			String tempLine;
			
			while ((tempLine = br.readLine()) != null)
			{
				theFortunes.add(tempLine);
				
			}
		} 
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune()
	{
		int index = myRandom.nextInt(theFortunes.size());
		
		return theFortunes.get(index);
	}

}
