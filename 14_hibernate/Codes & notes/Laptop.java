package com.telusko.Demohb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;

	private String lname;
	@ManyToMany
	private List<Student> student=new ArrayList<Student>();
	public int getLid() {
		return lid;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	

}
