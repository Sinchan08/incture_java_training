package com.demo.collections;
import java.util.LinkedList; //instead of using everytime you can give import java.util.*
import java.util.*;
public class DemoLinkelist {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		
		//insertion
		ll.add(10);
		ll.add(23);
		ll.add(45);
		System.out.println(ll);
		
		//traversel of linked list
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//removing elemnts from linked list
		ll.remove(0);
		System.out.println(ll);
		
		//Acessing elemnts from linked list for that we have get function
		//System.out.println("The elemeents at index one is"+ll.get(2));//we will get java.lang.IndexOutOfBoundsException
		System.out.println("The elemeents at index one is:"+ll.get(1));
		 
		//removing all the elemnts from linkedlist
		ll.clear();
		System.out.println(ll);
		
		

	}

}
