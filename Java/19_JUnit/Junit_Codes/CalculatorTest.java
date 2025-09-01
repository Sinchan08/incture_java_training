package com.example.first_springboot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator cal;
	
	
	@Test          //to mark this method as test method this annotation is used
	void testAdd() {
		cal=new Calculator();
		int actual_result=cal.add(10,20);
		int expected_result=30;
		assertEquals(expected_result,actual_result);
		System.out.println("Test Case:"+"testAdd");
		
	}
	
	@Test
	void testSub() {
		cal=new Calculator();
		int actual_result=cal.sub(200,100);
		int expected_result=100;
		// assertEquals(expected_result,actual_result);
		assertTrue(actual_result==expected_result);
		System.out.println("Test Case:"+"testSub");
		
	}
//	@Test
//	void testMul() {
//		cal=new Calculator();
//		int actual_result=cal.mul(20,10);
//		int expected_result=300;
//		assertEquals(expected_result,actual_result);
//		
//	}
//	@Test
//	void testDiv() {
//		cal=new Calculator();
//		int actual_result=cal.div(200,100);
//		int expected_result=2;
//		assertEquals(expected_result,actual_result);
//		
//	}
//	@Test
//	void testGiveObj() {
//		cal=new Calculator();
//		//assertNotNull(cal.giveObj()); //test case pass
//		assertNull(cal.giveObj());       //fail
//	}
	
	@BeforeEach
	public void m1()
	{
		System.out.println("Our Test Case To BE Started.........");
	}
	
	@AfterEach
	public void m2()
	{
		System.out.println("Our Test Case Completed............");
	}
	
	@BeforeAll                                            
	public  static void m3() {                                  //it will give error if it is not static
		System.out.println("Before All Test Cases");
	}
	
	@AfterAll
	public static void m4() {
		System.out.println("After All Test Case");
	}

}
