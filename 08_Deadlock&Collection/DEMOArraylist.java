package com.demo.collections;
import java.util.ArrayList;

public class DEMOArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("ABC");
		lst.add("RAM");
		lst.add("Sita");
		//lst.add(2); it wiill give error because our array contains sting ryt
		System.out.println(lst);
		
		//Acessing array list
		System.out.println("THe elements available at 2nd index:"+lst.get(2));
		//Updating object of arraylist
		System.out.println(lst.set(2, "Laxman"));
		System.out.println("THe elements available at 2nd index:"+lst.get(2));
		//Remo

	}

}
