package com.nishant.entity;

public class MethodOverloading {
	public static void main(String[] args) {
		User1 user1 = new Employee1();
		user1.work();
		user1.work(4);
		user1.work("four");
	}

}
 class User1 {
	 public void work() {
		 System.out.println("user is working ");
		 
		 // TODO Auto-generated method stub


	 }
	 public void work(int duration) {
		 System.out.println("user is working for " +duration+ " hours");
		 
		 // TODO Auto-generated method stub

	}
	 public void work(String duration) {
		 System.out.println("user is working for " +duration+ " hours");
		 
		 // TODO Auto-generated method stub

	}
	 	 
 }
 class Employee1 extends User1 { // is a relationship with user one so employee is a component of user1 
	 
	 @Override
	 public void work() {
		 super.work();
		 System.out.println("My Employee is working");
	 }
	 
	 
 }
 