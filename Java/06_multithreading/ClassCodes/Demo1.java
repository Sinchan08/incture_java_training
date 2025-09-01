package com.demo.multithreading;
class AB extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child thraed");
		}
	}
}
class xy extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Second Thread");
		}
		
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB abj=new AB();
		abj.start();   //here only thread is created not ready to use
		xy obj=new xy();
		obj.start();
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread");
		}
				

	}

}

