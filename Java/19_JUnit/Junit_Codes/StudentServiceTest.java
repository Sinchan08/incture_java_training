package com.example.first_springboot.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.first_springboot.dao.StudentRepository;
import com.example.first_springboot.entites.Student;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
	
	@Mock
	private StudentRepository studentRepository;
	
	@InjectMocks
	private StudentService studentService;
    
	@Test
	void testGetStudentById()
	{
		Student mockStudent=new Student(111,"A","Delhi");
		
		when(studentRepository.findById(111)).thenReturn(Optional.of(mockStudent));
		
		Student result=studentService.getStudent(111);
		
		//assertThat(result).isNotNull();
		//assertThat(result.getName()).isEqualTo("A");
		
		verify(studentRepository, times(1)).findById(111);
	}
}
