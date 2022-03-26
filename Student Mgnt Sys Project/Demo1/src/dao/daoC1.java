package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.C1;

public class daoC1 {


	public int addC1Details(String fn,int id
		//daoZ.java01 ,String COL
		,String C1P1id
		,String C1C2
		,String C1C3
	)
	{
		int success=-1;
		System.out.println('\n'+fn+','+id
			//daoZ.java02 +','+COL
					+','+C1P1id
					+','+C1C2
					+','+C1C3
		);
		try 
		{
			Configuration c=new Configuration();
			SessionFactory sf=c.configure().buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			
			C1 r = new C1();
			// ----------Setters
			r.setId(id);
			//daoZ.java03 r.setCOL(COL);
			r.setC1P1id(C1P1id);
			r.setC1C2(C1C2);
			r.setC1C3(C1C3);
			
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
