package com.shristi.basic;
import java.util.Scanner;
import java.util.Arrays;
public class ArraySortInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		int arrayLength=sc.nextInt();
		
		System.out.println("Enter the values of array");
		int array[]=new int[arrayLength];
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted Array in Ascending Order: ");
		  for(int i=0;i<array.length;i++) { 
			  System.out.print(+array[i]+" "); 
			  }
		 
		

	}

}
