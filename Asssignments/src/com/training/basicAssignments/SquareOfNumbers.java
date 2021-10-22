package com.training.basicAssignments;
import java.util.Scanner;

public class SquareOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of array");
		Scanner sc=new Scanner(System.in);
		int lengthOfArray=sc.nextInt();
		
		int[] Array =new int[lengthOfArray];
		System.out.println("Enter the values");
		for(int i=0;i<lengthOfArray;i++) {
			Array[i]=sc.nextInt();
		}
		System.out.println("Square root of each value is ");
		for(int num:Array) {
			System.out.println(Math.sqrt(num));
		}

	}

}
