package com.nishant.entity;

public class StaticDemo {
 public static void main(String[] args) {
	Bank bank = new Bank();

	System.out.println(Bank.createAccountNumber());
	System.out.println(Bank.createAccountNumber());
	//System.out.println(Bank.instanceVariable);
	Bank bank1 = new Bank();
	System.out.println(Bank.createAccountNumber());
	System.out.println(Bank.createAccountNumber());
} 
}


class Bank {
	
	static int counter;
	
	int instanceVariable = 10;
	
	public static int createAccountNumber() {
		
		return ++counter;
	}
	
}