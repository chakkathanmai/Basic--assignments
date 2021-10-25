package com.training.javainterface;

public class Basic implements BasicCalculator {

	public void add(int x, int y) {
		System.out.println("Addition of Two numbers is : " + (x + y));

	}

	public void difference(int x, int y) {

		System.out.println("Substraction of Two numbers is : " + (x - y));

	}

	public void product(int x, int y) {

		System.out.println("Product of Two numbers is : " + (x % y));

	}

	public void divide(int x, int y) {

		System.out.println("Division of Two numbers is : " + (x / y));

	}

}
