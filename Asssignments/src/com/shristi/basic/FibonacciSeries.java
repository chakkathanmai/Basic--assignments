package com.shristi.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the Value to find Fibonacci series");
		int first_value = 0, second_value = 1;
		int fibonacci;
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println(first_value);
		System.out.println(second_value);
		for (int i = 0; i < value-2; i++) {
			fibonacci = first_value + second_value;
			System.out.println(fibonacci);
			first_value = second_value;
			second_value = fibonacci;
		}
		sc.close();
	}

}
