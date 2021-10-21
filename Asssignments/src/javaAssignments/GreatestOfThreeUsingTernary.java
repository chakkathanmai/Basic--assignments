package javaAssignments;
import java.util.Scanner;

public class GreatestOfThreeUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any 3 values");
		Scanner sc=new Scanner(System.in);
		int firstValue=sc.nextInt();
		int secondValue=sc.nextInt();
		int thirdValue=sc.nextInt();
		
		int greatestValue =firstValue>secondValue && firstValue>thirdValue?firstValue:secondValue>thirdValue ? secondValue:thirdValue;
		System.out.println("Greatest value is  "+greatestValue);
        sc.close();
	}

}
