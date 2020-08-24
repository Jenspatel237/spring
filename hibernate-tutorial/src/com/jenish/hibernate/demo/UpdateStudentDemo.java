package com.jenish.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jenish.hibernate.demo.entity.Student;


public class UpdateStudentDemo
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

			int studentId = 1;
			
			// now get a new session and start a transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("hello");
			
			
			// commit the transaction
			session.getTransaction().commit();
			
			// new code
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			// update email for all students
			System.out.println("Updating email for all students...");
			
			session.createQuery("update Student set email='jc@gmail.com'")
				   .executeUpdate();
			
			
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
