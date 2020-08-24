package com.jenish.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jenish.hibernate.demo.entity.Employee;

public class DeleteEmployeeDemo
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
			int id = 1;
			session.beginTransaction();
			
//			Employee employee = session.get(Employee.class, id);
//			
//			session.delete(employee);
			
			session.createQuery("delete from Employee where id=2").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Detete Complete...");
			
		}
		finally 
		{
			factory.close();
		}

	}

}
