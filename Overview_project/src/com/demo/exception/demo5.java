package com.demo.exception;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//order of exception is important
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int result;
		int first=sc.nextInt();
		System.out.println("Enter the second number:");
		int second=sc.nextInt();
		
		System.out.println("First line");
		
		System.out.println("second line");
		try {
		result=first/second;
		}
		catch(ArithmeticException e) {
			result=5;
		}
		catch(RuntimeException e) {
			result=5;
		}
		catch(Exception e) {
			result=5;
		}
		System.out.println("Result:"+result);
		
		System.out.println("Third line");

	}

}
