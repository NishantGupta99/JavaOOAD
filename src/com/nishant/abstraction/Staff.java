package com.nishant.abstraction;

public abstract class Staff {
	private String name;

	public void fillTimeSheet() {
		System.out.println(name + " has filled time the  sheet ");

	}

	public abstract void work();
}

class HR extends Staff {
	@Override
	public void work() {
		System.out.println("the HR is working");

	}

}

class Guard extends Staff {
	public void work() {
		System.out.println("the guard is working!");

	}

}