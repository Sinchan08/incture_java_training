package com.demo.collection;
import java.util.Map;
import java.util.TreeMap;
class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class DemoAss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Double,Employee>map=new TreeMap<>();
		
		map.put(50000.0, new Employee(101, "A",50000));
		map.put(40000.0, new Employee(102,"B",40000));
		map.put(60000.0, new Employee(103,"C",60000));
		System.out.println("Employees sorted by salary:");
		
		for(Map.Entry<Double, Employee> entry:map.entrySet()) {
			System.out.println(entry.getValue());
		}
		

	}

}
