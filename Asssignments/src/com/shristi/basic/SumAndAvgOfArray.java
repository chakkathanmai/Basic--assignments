package com.shristi.basic;

import java.util.Scanner;

public class SumAndAvgOfArray {
	public static void main(String args[]) {
		System.out.println("Enter any 5 values in to array");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array is " + sum);
		System.out.println("Average of array is " + (double) (sum / (array.length)));
		sc.close();
	}

}
