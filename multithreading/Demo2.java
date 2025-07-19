package com.demo.multithreading;
class AB extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		AB abj=new AB();
		abj.start();      //here only thread is created not ready to use
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread");
		}
			
	}

}
