package com.demo.overview;
import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
       int a;
       System.out.println("Enter the value of a");
       a=sc.nextInt();
       int b;
       System.out.println("Enter the value of b");
       b=sc.nextInt();
       int choices;
       System.out.println("Enter your choices:");
       choices=sc.nextInt();
       switch(choices)
       {
       case 1:{
    	   System.out.println("addition of a+b is"+  (a+b));
    	   break;
       }
       case 2:{
    	   System.out.println("substraction of a-b is"+ (a-b));
    	   break;
       }
       case 3:{
    	   System.out.println("Multiplication of a*b is"+ (a*b));
    	   break;
       }
       case 4:{
    	   System.out.println("Division of a/b numbers is"+ (a/b));
       }
       
       default:
    	   System.out.println("Invalid choice");
    	   
       }
    	   
    	   
     
       
	}

}
