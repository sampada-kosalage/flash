package org.study.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CURDOpeation {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			Employee emp=new Employee("name","password","email","country");
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			System.out.println("Row added!");
			
	}finally {
		session.close();
		factory.close();
	}
	}
		
		/*try {
			Users user=new Users("Sampada","sam@gmail.com","sa","ko");
			session.beginTransaction();
			
			//perform insert operation
			session.save(user);
			
			//perform select operation
			user=session.get(Users.class,1);
			
			//perform update operation
			 user.setUsername("sam@gmail.com");
			
			//delete operation
			session.delete(user);
			
			//commit the teansaction
			session.getTransaction().commit();
			System.out.println(user);
			
			
		}finally {
			session.close();
			factory.close();
		}
		
		try {
			//start transaction
			session.beginTransaction();
			
			//create HQL Query
			List<Users>user=session.createQuery("from users").getResultList();
		    for(Users temp:user) {
		    	System.out.println(temp);
		    }
		    //commit transaction
		    session.getTransaction.commit();
		
		}finally {
			session.close();
			factory.close();
		}
		
		
		
		try {
			session.beginTransaction();
			
			List<Users>user=session.createQuery("from users where firstname='sa'"+"OR lastname like 'pritam'").get.ResultList();
		
			//session.createQuery("update users set password='abcd'"+"OR firstname='ss'")executeUpdate();
			
			session.createQuery("delete from users where userid=1").executeUpdate();

			
			for(Users temp:user) {
				System.out.println(temp);
			}
		  session.getTransaction().commit();
		
		}finally {
			
			session.close();
			factory.close();
		}*/
}



