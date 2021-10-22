package com.training.basicAssignments;

public class Bank {
        double balance=0;

		public Bank(double balance) {
			super();
			this.balance = balance;
		}
        
		public void withdraw(int x) {
			
		}
        public void deposit(int x) {
			balance+=x;
		}
        public double getBalance() {
			return balance;
		}
		
		
}
