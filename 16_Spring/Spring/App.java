package com.demo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Display ob=new Display();
//        ob.msg();
    	
    	//ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/demo/Spring/applicationContext.xml");
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//Display d=(Display)context.getBean("dis");
    	Display d=(Display)context.getBean(Display.class);
    	d.msg();
    	
    }
}
