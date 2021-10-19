package com.shristi.basic;
import java.util.Scanner;
public class PerfectNumber {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Value to check Perfect Number");
	  int givenvalue=sc.nextInt();
	  
	  int sum=0;
	  for(int i=1;i<givenvalue;i++) {
		  if(givenvalue%i==0) {
			  sum+=i;
		  }
	  }
	  if(sum==givenvalue) {
		  System.out.println("Given value is Perfect Number");
	  }
	  else {
		  System.out.println("Given value is Not a perfect Number");
	  }
	  sc.close();
  }
}
