package javaAssignments;
import java.util.Scanner;
public class SmallestOfThreeNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any 3 values");
		int firstValue=sc.nextInt();
		int secondValue=sc.nextInt();
		int thirdValue=sc.nextInt();
		
		if(firstValue<secondValue&&firstValue<thirdValue){
			System.out.println("the smallest value is "+firstValue);
		}else if(secondValue<thirdValue) {
			System.out.println("the smallest value is "+secondValue);
		}else {
			System.out.println("the smallest value is "+thirdValue);
		}
		sc.close();
	}

}
