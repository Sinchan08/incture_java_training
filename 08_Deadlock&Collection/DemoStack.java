package com.demo.collections;
import java.util.*;

public class DemoStack {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(5);
		st.push(2);
		st.push(5);  //duplicate elements are allowed
		st.push(4);
		System.out.println(st);
		
		//removing
		st.pop();
		st.pop();
		System.out.println(st);
		
		//searching
		System.out.println("Searching elemennt with value 5 inside the stack:"+st.search(5));
		
		//finding out the top most element in the stack
		
		System.out.println("Element at the topmost position is"+st.peek());
		
		//clear
		st.clear();
		System.out.println(st);

	}

}
