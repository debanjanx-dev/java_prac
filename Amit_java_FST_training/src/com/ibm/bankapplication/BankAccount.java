package com.ibm.bankapplication;

public class BankAccount implements Depositable {
	private Account account;
	public BankAccount(Account account) {
		this.account = account;
	}
	public void deposit(double amount) {
		if(amount > 0 ) {
			account.setBalance(account.getBalance() + amount);
			System.out.println("Deposited" + amount);
		}
	}
	 public void withdraw(double amount) {
	        if (amount <= account.getBalance()) {
	            account.setBalance(account.getBalance() - amount);
	            System.out.println("Withdrawn ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
	 
	  public boolean applyForLoan(double amount) {
		 if( account.getBalance() >= 5000 ) {
			 System.out.println("Eligible for loan");
			 return true;
		 }
		 System.out.println("Loan Rejected");
	        return false;
	 }
	
}
