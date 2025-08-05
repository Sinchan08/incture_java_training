package com.example.first_springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.first_springboot.entites.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
