package com.shristi.basic;

import java.util.Scanner;

public class ReversePyramidWithStars {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int givenValue = sc.nextInt();
		for (int i = 0; i < givenValue; i++) {
			for (int j = givenValue - i; j > 0; j--) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

}