package com.jenish.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jenish.hibernate.demo.entity.Employee;


public class CreateEmployeeDemo
{

	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration()
											.configure()
											.addAnnotatedClass(Employee.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try
		{
		
			Employee employee = new Employee("Jenish", "Patel", "Jens Corporation");
			Employee employee1 = new Employee("Rajesh", "Patel", "Jens Corporation");
			Employee employee2 = new Employee("Fagun", "Patel", "FS Corporation");
			Employee employee3 = new Employee("Aku", "Parikh", "AK Corporation");
			
			session.beginTransaction();
			
			session.save(employee);
			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			
			session.getTransaction().commit();
		}
		finally 
		{
			sessionFactory.close();
		}

	}

}
