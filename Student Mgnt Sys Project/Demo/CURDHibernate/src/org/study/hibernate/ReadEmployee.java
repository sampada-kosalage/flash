package org.study.hibernate;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployee {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		org.hibernate.query.Query query=session.createQuery("from Employee");
		List emps=query.list();
		for(Employee emp : emps)
		{
			System.out.println("Name:"+emp.getName()+",Password:"+emp.getPassword()+",Email:"+emp.getEmail()+",Country:"+emp.getCountry());
			
		}
		session.getTransaction().commit();
		factory.close();
		session.close();
	}

}
