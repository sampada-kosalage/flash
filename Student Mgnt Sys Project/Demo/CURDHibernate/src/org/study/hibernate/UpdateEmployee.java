package org.study.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
	
		Employee emp=(Employee)session.get(Employee.class,2);
		emp.setName("Piyush");
		System.out.println("Update Successfully");
		session.getTransaction().commit();
		factory.close();
	    session.close();
	}

}
