package com.nishant.statickeyword;

public class StaticBlockDemo {
	static int price = 100;
	int age = 20;
	public StaticBlockDemo() {
		System.out.println("this is the constructor ...");
	}
	static {
		System.out.println("but i will be called first! :-/ but only ones no matter how many objectes you create " +price);
	}
 public static void main(String[] args) {
	StaticBlockDemo staticbhai = new StaticBlockDemo();
	new StaticBlockDemo();
}
 void work() {
	 int time = 45;
 }
}
