package org.study.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
	
		Employee emp=(Employee)session.load(Employee.class,2);
		session.delete(emp);
		System.out.println("Delete Successfull");
		session.getTransaction().commit();
		factory.close();
		session.close();	}

}
