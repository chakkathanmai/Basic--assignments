package com.shristi.basic;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of array");
		int arrayLength=sc.nextInt();
		int Array[]=new int[arrayLength];
		
		System.out.println("enter the values to array");
		for(int i=0;i<Array.length;i++) {
			Array[i]=sc.nextInt();
		}
		
		/*
		 * for (int i = 0; i < array.length; i++) { array[i] = sc.nextInt(); }
		 */
		System.out.println("Initial Array");
		for(int i=0;i<Array.length;i++) {
			
			System.out.print(Array[i]+" ");
		}
		System.out.println("");
		System.out.println("Reversed array");
		for(int i=Array.length-1;i>=0;i--) {
			System.out.print(Array[i]+" ");
		}
	}

}
