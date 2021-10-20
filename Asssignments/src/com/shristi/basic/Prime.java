package com.shristi.basic;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value to check prime or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number-1;i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		if(count>1) {
			System.out.println("Given value is not a Prime");
		}else {
			System.out.println("Given value is Prime");
		}
		sc.close();
	}

}
