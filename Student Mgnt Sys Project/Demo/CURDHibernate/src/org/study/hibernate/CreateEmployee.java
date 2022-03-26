package org.study.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {

	public static void main(String[] args) {

	  Employee emp=new Employee();
	   emp.setName("Sampada");
	   emp.setEmail("sam@gmail.com");
	   emp.setCountry("India");
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	
	session.save(emp);
	System.out.println("Inserted Successfully");
	session.getTransaction().commit();
	session.close();
	factory.close();
	

}
	}
	

