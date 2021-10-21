package javaAssignments;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Amount to Deposit");
		Scanner sc=new Scanner(System.in);
		double depositedAmount=sc.nextInt();
		
		Bank depoAmount=new Bank(depositedAmount);
		
		
		double balance=depoAmount.getBalance();
		System.out.println("Your balance is "+balance);
	}

}
