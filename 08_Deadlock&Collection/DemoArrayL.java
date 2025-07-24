package com.demo.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayL {

	public static void main(String[] args) {
		//Adding elements to array list
		ArrayList<String> lst=new ArrayList();
		lst.add("sinch");
		lst.add("raksha");
		lst.add("sam");
		lst.add("venu");
		System.out.println(lst);
		
		//Accesing ArrayList
		System.out.println("te elements available at 2nd index:"+lst.get(2));
        //updating elements at arraylist
		lst.set(2, "sameeksha");
		System.out.println(lst);
		
		//removing elements at array list
		lst.remove(3);
		System.out.println(lst);
		
		//Iterating The ArrayList
		Iterator itr=lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
