package com.amdocs;

public class SavingAccount {
	public double getBalance() {
		System.out.println("Assume balanc ei s retrieved from database");
		return 7000.00;
		
	}
	public double withdraw (double amountToBeWithdrawn) {
		System.out.println("Inside withdraw method");
		
		double currentBalance = getBalance();
		if(amountToBeWithdrawn < currentBalance)
			currentBalance = currentBalance - amountToBeWithdrawn;

		updateBalanaceIntoDB(currentBalance);
		return currentBalance;
	}
	
	public void updateBalanaceIntoDB(double currentBalance) {
		System.out.println("Assume here balance i supdated into database");
	}
}
