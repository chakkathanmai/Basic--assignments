package com.shristi.basic;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		int value,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to check Armstrong");
		 value = sc.nextInt();
		String valueToString =Integer.toString(value);
		/* System.out.println(valueToString); */
		int lengthOfValue =valueToString.length();
		int givenValue=value;
		while(givenValue !=0) {
			int reminder=givenValue %10;
			sum+=Math.pow(reminder,lengthOfValue);
			givenValue/=10;
		}
		if(value==sum) {
			System.out.println("Given value is Armstrong");
		}else {
			System.out.println("Given value is not a Armstrong");
		}
		sc.close();
	}

}
