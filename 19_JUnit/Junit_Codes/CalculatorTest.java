package com.example.first_springboot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator cal;
	
	
	@Test          //to mark this method as test method this annotation is used
	void testAdd() {
		cal=new Calculator();
		int actual_result=cal.add(10,20);
		int expected_result=30;
		assertEquals(expected_result,actual_result);
		
	}
	
	@Test
	void testSub() {
		cal=new Calculator();
		int actual_result=cal.sub(200,100);
		int expected_result=100;
		assertEquals(expected_result,actual_result);
		
	}
	@Test
	void testMul() {
		cal=new Calculator();
		int actual_result=cal.mul(20,10);
		int expected_result=300;
		assertEquals(expected_result,actual_result);
		
	}
	@Test
	void testDiv() {
		cal=new Calculator();
		int actual_result=cal.div(200,100);
		int expected_result=2;
		assertEquals(expected_result,actual_result);
		
	}

}
