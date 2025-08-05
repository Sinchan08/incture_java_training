package com.example.first_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.first_springboot.dao.StudentRepository;
import com.example.first_springboot.entites.Student;

@SpringBootApplication       //cls where main method is available we have to make
public class FirstSpringBootApplication {

	public static void main(String[] args) {
//		// SpringApplication.run(FirstSpringBootApplication.class, args);
//		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
//		StudentRepository studentRepository=context.getBean(StudentRepository.class);
//		Student s1=new Student();
//		s1.setId(222);
//		s1.setName("Sinchana");
//		s1.setCity("Ankola");
//		
//		Student s2=new Student();
//		s2.setId(111);
//		s2.setName("Sam");
//		s2.setCity("Udupi");
//		
//		Student student1=studentRepository.save(s1);
//		Student student2=studentRepository.save(s2);
//		System.out.println(s1);
//		System.out.println(s2);
		
		SpringApplication.run(FirstSpringBootApplication.class, args); //here obly htis staement is used and not added manually like creating object as above
		
		
		}

}
