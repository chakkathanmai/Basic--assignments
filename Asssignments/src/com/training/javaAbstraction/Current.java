package com.training.javaAbstraction;

public class Current extends Bank {
	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if((balance>amount)&&(amount !=0)) {
		 balance=balance-amount-30;
		 System.out.println("Balance avilable after Withdraw: "+balance);
		 System.out.println("with");
	}else {
		System.out.println("Insufficient balance");
		}}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount !=0) {
		 balance=balance+amount+30;
		 System.out.println("Balance avilable after deposite: "+balance);
	}else {
		System.out.println("Enter the valid amount");
	} 
	}
	
}
