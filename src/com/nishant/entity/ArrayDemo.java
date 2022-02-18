package com.nishant.entity;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		EnhancedForLoop();
		demo1();

	}

	private static void EnhancedForLoop() {
		// TODO Auto-generated method stub

		int[] numbers = { 45, 2387, 54, 22, 321, 67, 8 };
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
				
			}
		}
	}

	private static void demo1() {
		int[] numbers = new int[10];
		numbers[3] = 65;
		numbers[6] = 70;
		Arrays.sort(numbers, 0, numbers.length - 1);
		for (int number1 = 0; number1 < 10; number1++) {
			//System.out.println(numbers[number1]);
		}
	}

}
