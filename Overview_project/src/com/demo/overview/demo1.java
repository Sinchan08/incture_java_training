package com.demo.overview;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		// int arr[]= {10,20,30,40};
		int arr[]=new int[4];
		//arr[0]=10;
		//arr[1]=20;
		//arr[2]=30;
		
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		
		System.out.println("Please eneter array elements");
		for(int j=0;j<=arr.length-1;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		//arr[4]=50;
		//System.out.println(arr[4]);

	}

}
