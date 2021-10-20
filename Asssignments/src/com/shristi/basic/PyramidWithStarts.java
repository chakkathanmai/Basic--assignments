package com.shristi.basic;
import java.util.Scanner;
public class PyramidWithStarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int givenValue=sc.nextInt();
		for(int i=0;i<givenValue;i++) {
			
			//System.out.println(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
