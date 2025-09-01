package com.demo.hibernate_ass;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "students")
public class Student {
	@Id
    private int id;

    private String name;
    private int age;
    @ManyToMany(cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
    private List<Course> courses = new ArrayList<>();
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
	
	
	

}
