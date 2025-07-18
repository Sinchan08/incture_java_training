package com.demo.overview;

public class demo3 {
	
	public int add(int a,int b){
		int sum=a+b;
		System.out.println("Hello");
		return sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 obj=new demo3();
		int res1=obj.add(10,20);
		System.out.println("res1:"+res1);
		int res2=obj.add(30,20);
		System.out.println("res2:"+res2);

	}

}
