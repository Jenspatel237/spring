package com.jenish.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jenish.hibernate.demo.entity.Student;


public class QueryStudentDemo
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
			
			// start transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// Display the students
//			System.out.println(theStudents);
			
			displayStudents(theStudents);
			
			
			// query students: lastName="Patel"
			theStudents = session.createQuery("from Student s where s.lastName='Patel'").getResultList();
			// Display the students
			System.out.println("\n Students who have last name of Patel");
			displayStudents(theStudents);
			
			
			// query students: lastName="Patel" OR firstName='John'
			theStudents = session.createQuery("from Student s where s.lastName='Patel' OR s.firstName='John'").getResultList();
			// Display the students
			System.out.println("\n Students who have last name of Patel and first name of John'");
			displayStudents(theStudents);
			
			

			// query students where email LIKE '%gmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			// Display the students
			System.out.println("\n Students who have email LIKE '%gmail.com'");
			displayStudents(theStudents);
			
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		}
		finally 
		{
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents)
	{
		for(Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}
	}

}
