package com.shristi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter values into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Second Largest value in array is " + array[3]);
		sc.close();
	}

}
