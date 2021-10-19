package com.shristi.basic;

import java.util.Scanner;

public class FactorialOfNum {
	public static void main(String args[]) {
		System.out.println("Enter the value to find factorial");
		Scanner sc = new Scanner(System.in);
		int givenValue = sc.nextInt();
		int valueToFindFactorail = 1;
		for (int i = 1; i <= givenValue; i++) {
			valueToFindFactorail = valueToFindFactorail * i;

		}
		System.out.println("Factorial is "+valueToFindFactorail);
		sc.close();
	}

}
