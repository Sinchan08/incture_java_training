package com.telusko.Demohb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Aliens sinch=new Aliens();
    	AlienName an=new AlienName();
    	an.setFname("Sinchana");
    	an.setMname("S");
    	an.setLname("Naik");
    	
    	sinch.setId(141);
    	sinch.setName(an);
    	sinch.setCity("Ankola");
    	
    	Configuration con=new Configuration();                //Configuration is class
    	con.configure();
    	SessionFactory sf=con.buildSessionFactory();        //Session factory is also interface
    	Session session =sf.openSession();       //session is a interface we cannot write diectly object of it
    	Transaction tx=session.beginTransaction();
    	session.save(sinch);
    	
    	//sinch =session.get(Aliens.class, 121);
    	tx.commit();
    	System.out.println(sinch);
    }
}
