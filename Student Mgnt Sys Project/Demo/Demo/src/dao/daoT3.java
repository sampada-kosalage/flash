package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.T3;

public class daoT3 {


	public int addT3Details(String fn,int id
		//daoZ.java01 ,String COL
		,String T3C1
		,String T3C2
		,String T3C3
	)
	{
		int success=-1;
		System.out.println('\n'+fn+','+id
			//daoZ.java02 +','+COL
					+','+T3C1
					+','+T3C2
					+','+T3C3
		);
		try 
		{
			Configuration c=new Configuration();
			SessionFactory sf=c.configure().buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			
			T3 r = new T3();
			// ----------Setters
			r.setId(id);
			//daoZ.java03 r.setCOL(COL);
			r.setT3C1(T3C1);
			r.setT3C2(T3C2);
			r.setT3C3(T3C3);
			
			if(fn.equals("Add"))
				id = (Integer)s.save(r);
			else
				s.update(r);
			tr.commit();
			sf.close();
			success=0;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			success=-1;
		}
		return(success);
	}
}
