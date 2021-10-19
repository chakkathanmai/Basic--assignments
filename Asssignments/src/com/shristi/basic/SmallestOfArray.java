package com.shristi.basic;

import java.util.Scanner;

public class SmallestOfArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter vales in array");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int smallestOfArray = array[0];
		for (int i = 0; i < array.length; i++) {
			if (smallestOfArray > array[i]) {
				smallestOfArray = array[i];

			}
		}
		System.out.println("Smallest Number in Array is " + smallestOfArray);
		sc.close();

	}
}
