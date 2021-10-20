package com.shristi.basic;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int givenValue=sc.nextInt();
		int count=1;
		for(int i=1;i<=givenValue;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" "+count);
				count++;
			}
			System.out.println();
		}
       sc.close();
	}

}
