package com.telusko.Demohb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App1 {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");

		Student s=new Student();
		s.setName("Sinchana");
		s.setRollno(1);
		s.setMarks(50);
		s.getLaptop().add(laptop);
		laptop.getStudent().add(s);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(s);	
		
		session.getTransaction().commit();
		
		

	}

}
