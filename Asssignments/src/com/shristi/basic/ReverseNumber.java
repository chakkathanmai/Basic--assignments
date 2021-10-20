package com.shristi.basic;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0,reminder=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value to be reversed");
        int number=sc.nextInt();
        
        while(number>=1){
        	reminder = number%10;
        	reverse=reverse*10+reminder;
        	number=number/10;
        	
        }
        System.out.println("reversed number is: "+reverse);
        sc.close();
	}

}
