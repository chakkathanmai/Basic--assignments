package com.shristi.basic;

import java.util.Scanner;

public class GreaterOfArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter values into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int greaterValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (greaterValue < array[i]) {
				greaterValue = array[i];
			}
		}
		System.out.println("Greater value in array is " + greaterValue);
		sc.close();
	}

}
