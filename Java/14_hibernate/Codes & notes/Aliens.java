package com.telusko.Demohb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                  // here it will change enetity name also(name="alkoo")  if you dont specidy name here then bydefault table name is cls name itself i.e Aliens
//@Table(name="alkoo")if we want to change table name we should use this           
public class Aliens {
  
	@Id
	private int id;
	private AlienName name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public AlienName getName() {
		return name;
	}
	public void setName(AlienName name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Aliens [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
