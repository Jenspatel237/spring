package com.jenish.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jenish.hibernate.demo.entity.Student;

public class PrimaryKeyDemo
{

	public static void main(String[] args)
	{
		// Create session factory
				SessionFactory factory = new Configuration()
											 .configure("hibernate.cfg.xml")
											 .addAnnotatedClass(Student.class)
											 .buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try
				{
					// create 3 student objects
					System.out.println("Creating 3 student objects");
					Student tempStudent = new Student("John", "Doe", "john@jc.com");
					Student tempStudent1 = new Student("Mary", "Public", "mary@jc.com");
					Student tempStudent2 = new Student("Rajesh", "Patel", "rj@jc.com");
					
					// start transaction
					session.beginTransaction();
					
					// save the student object
					System.out.println("Saving the student...");
					session.save(tempStudent);
					session.save(tempStudent1);
					session.save(tempStudent2);
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
					
				}
				finally 
				{
					factory.close();
				}

	}

}
