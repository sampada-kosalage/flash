package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.T1;

public class daoT1 {


	public int addT1Details(String fn,int id
		//daoZ.java01 ,String COL
		,String T1C1
		,String T1C2
		,String T1C3
	)
	{
		int success=-1;
		System.out.println('\n'+fn+','+id
			//daoZ.java02 +','+COL
					+','+T1C1
					+','+T1C2
					+','+T1C3
		);
		try 
		{
			Configuration c=new Configuration();
			SessionFactory sf=c.configure().buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			
			T1 r = new T1();
			// ----------Setters
			r.setId(id);
			//daoZ.java03 r.setCOL(COL);
			r.setT1C1(T1C1);
			r.setT1C2(T1C2);
			r.setT1C3(T1C3);
			
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
