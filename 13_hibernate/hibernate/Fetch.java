package com.demo.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        //student s1=session.get(student.class,1);
        Student s1=session.get(Student.class,1);
        System.out.println("id:"+s1.getId());
        System.out.println(s1);
        System.out.println("----------------");
        /*student s2=session.get(student.class,1);
        System.out.println("id:"+s2.getId());
        System.out.println(s2);*/
	}

}

