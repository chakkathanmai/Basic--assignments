package com.shristi.basic;
import java.util.Scanner;
import java.util.Arrays;
public class CountOfDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the length of the array");
		Scanner sc= new Scanner(System.in);
		int arrayLength=sc.nextInt();
		
		System.out.println("Enter the values in array");
		int array[]=new int[arrayLength];
		for(int i=0;i<arrayLength;i++) {
			array[i]=sc.nextInt();
		}
		
		Arrays.sort(array);
		//System.out.println(array);
		
		for(int i=0;i<array.length-1;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
				}else 
					break;
				}
				if(count>1) {
					System.out.println(array[i]+" --->"+count);
					i=i+count-1;
				}
			}
		}
		

	}


