package com.nishant.exceptionsDemo;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("there has been an error cuz you dont know basic maths");
		}
	}

}
