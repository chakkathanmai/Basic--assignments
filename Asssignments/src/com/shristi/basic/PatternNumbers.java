package com.shristi.basic;
import java.util.Scanner;

public class PatternNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int givenValue=sc.nextInt();
		for(int i=1;i<=givenValue;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
	sc.close();
	}
}
