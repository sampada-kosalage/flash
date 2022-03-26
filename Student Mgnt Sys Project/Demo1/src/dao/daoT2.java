package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.T2;

public class daoT2 {


	public int addT2Details(String fn,int id
		//daoZ.java01 ,String COL
		,String T2C1
		,String T2C2
		,String T2C3
	)
	{
		int success=-1;
		System.out.println('\n'+fn+','+id
			//daoZ.java02 +','+COL
					+','+T2C1
					+','+T2C2
					+','+T2C3
		);
		try 
		{
			Configuration c=new Configuration();
			SessionFactory sf=c.configure().buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			
			T2 r = new T2();
			// ----------Setters
			r.setId(id);
			//daoZ.java03 r.setCOL(COL);
			r.setT2C1(T2C1);
			r.setT2C2(T2C2);
			r.setT2C3(T2C3);
			
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
