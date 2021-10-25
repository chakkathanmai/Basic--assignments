package com.voting.main;

import java.util.Scanner;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBooth;


public class Voter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ElectionBooth votingbooth = new ElectionBooth();
		int age = 0;
		String locallity = null;
		int vid = 0;
		try {
			System.out.println("WELCOME TO VOTER VERIFICATION");
			System.out.println();
			System.out.print("Enter age: " + " ");
			age = input.nextInt();
			if(age<18){
				System.out.println("Eligible age is 18 and above - Not Eligible");
				System.exit(0);
			}
			
			System.out.print("Enter locality: " );
			input.nextLine();
			locallity=input.nextLine();
			System.out.print("Enter voter ID: ");
			vid = input.nextInt();
		
		votingbooth.checkEligibility(age,locallity, vid);
	} 
	catch (NotEligibleException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
		input.close();

}
}
