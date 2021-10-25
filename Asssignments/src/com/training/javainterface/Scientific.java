package com.training.javainterface;

public class Scientific extends Basic implements ScientificCalculator {

	public void square(int x) {
		System.out.println("Square of a numbers is : " + (x * x));

	}

	public void cube(int x) {
		System.out.println("Cube of a number is " + (x * x * x));

	}

}
