package com.demo.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {
	@Autowired
private A ref;
	public void msg() {
		System.out.println("Welcome to Spring Application");
		ref.wish();
		System.out.println("Thank You........");
	}

}
