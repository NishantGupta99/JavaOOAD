package com.nishant.interfaceDemo;

public class HR implements IStaff {
	@Override
	public void work() {
		System.out.println("The HR is out hunting for fresh talents");
	}

	@Override
	public void test1() {
		System.out.println("the HR has passed the test!");

	}
}
