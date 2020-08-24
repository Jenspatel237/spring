package com.jenish.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jenish.hibernate.demo.entity.Employee;

public class ReadEmployeeDemo
{

	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration()
									 .configure()
									 .addAnnotatedClass(Employee.class)
									 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try
		{
			session.beginTransaction();
			
			Employee employee = session.get(Employee.class, 1);
			
			System.out.println("Get Complete: " + employee);
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			List<Employee> employee1 = session.createQuery("from Employee where company='Jens Corporation'").getResultList();
			
			session.getTransaction().commit();
			
			for(Employee emp : employee1)
			{
				System.out.println(employee1);
			}
		}
		finally 
		{
			factory.close();
		}

	}

}
