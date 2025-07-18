package com.demo.overview;
class A{
	public static void m1(int y,String x) {
		System.out.println("Hi");
	}
	public static void m1(int x,int y) {
		System.out.println("Hello");
	}
	public static void m1(boolean x) {
		System.out.println("Hey");
	}
}
public class demo4 {
	public static void main(String[] args) {
		A.m1(false);
		A.m1(3,"hello");
	}

}
