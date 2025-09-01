package com.example.first_springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.first_springboot.DemoContoller;
import com.example.first_springboot.dao.StudentRepository;
import com.example.first_springboot.entites.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	public List<Student> getAllStudents()
	{
		List<Student> students=(List<Student>)studentRepository.findAll();
		return students;
	}
	public Student getStudent(int id)
	{
		Optional<Student> optional=studentRepository.findById(id);
		Student s=optional.get();
		return s;
		
	}
	public Student addStudent(Student s) {
		Student student=studentRepository.save(s);
		return student;
	}
	
	public Student updateStudent(int id,Student s) {
		s.setId(id);
		Student student=studentRepository.save(s);
		return student;
	}
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
		

}
