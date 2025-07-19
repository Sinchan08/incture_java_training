package com.demo.string;
final class MyImmutable{
	private int i;
	public MyImmutable(int i) {
		this.i=i;
	}
	public MyImmutable modifyContent(int i) {
		if(this.i==i) {
			return this;
		}
		else
		{
			return new MyImmutable(i);
		}
	}
}

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyImmutable obj1=new MyImmutable(10);
		MyImmutable obj2=obj1.modifyContent(10);
		System.out.println(obj1==obj2);

		
	}

}
