package com.jenish.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc
{

	public static void main(String[] args)
	{
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?serverTimezone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";
		try
		{
			System.out.println("Connecting ti Database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Connection Successful!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
