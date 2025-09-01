package com.demo.collections;
import java.util.*;
//import java.util.Iterator;

public class DemoVectocls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		//Adding Elemnyts
		v.add("Java");
		v.add("SCEM");
		v.add("Java is Fun");
		System.out.println(v);
		
		//Acessing elements 
		System.out.println("Acessing element at location 1:"+v.get(0));
        
		//Removing elemts
		v.remove(1);
		System.out.println(v); 
		
		//Traversal
		
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
