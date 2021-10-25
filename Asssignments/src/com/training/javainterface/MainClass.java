package com.training.javainterface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator referance = new Basic();// object of interface
		referance.add(20, 20);
		referance.difference(20, 20);
		referance.product(20, 20);
		referance.divide(20, 2);

		ScientificCalculator scientific = new Scientific();// object of interface
		scientific.square(20);
		scientific.cube(20);

	}

}
