package com.example.first_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_springboot.entites.Student;
import com.example.first_springboot.service.StudentService;

//@Controller
//@ResponseBody
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		List<Student> students=this.studentService.getAllStudents();
		return students;
	}
	
	@RequestMapping(path="student/{s_id}",method=RequestMethod.GET)
	//GetMapping("student/{s_id}")
	public Student getstudent(@PathVariable("s_id")int id) {
	   return this.studentService.getStudent(id);
	}
	
	@RequestMapping(path="/students",method=RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	@RequestMapping(path="/student/{s_id}",method =RequestMethod.PUT)
	public Student updateStudent(@PathVariable("s_id")int id, @RequestBody Student student) {
		return this.studentService.updateStudent(id, student);
	}
	
	@RequestMapping(path="/student/{s_id}",method=RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("s_id") int id) {
		this.studentService.deleteStudent(id);
		return "Student deleted sucessfully with ID:"+id;
	}
	

}
