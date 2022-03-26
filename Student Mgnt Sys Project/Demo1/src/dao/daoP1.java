package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.P1;

public class daoP1 {


	public int addP1Details(String fn,int id
		//daoZ.java01 ,String COL
		,String P1C1
		,String P1C2
		,String P1C3
	)
	{
		int success=-1;
		System.out.println('\n'+fn+','+id
			//daoZ.java02 +','+COL
					+','+P1C1
					+','+P1C2
					+','+P1C3
		);
		try 
		{
			Configuration c=new Configuration();
			SessionFactory sf=c.configure().buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			
			P1 r = new P1();
			// ----------Setters
			r.setId(id);
			//daoZ.java03 r.setCOL(COL);
			r.setP1C1(P1C1);
			r.setP1C2(P1C2);
			r.setP1C3(P1C3);
			
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
