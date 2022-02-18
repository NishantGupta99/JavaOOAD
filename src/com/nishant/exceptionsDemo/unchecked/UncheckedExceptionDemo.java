package com.nishant.exceptionsDemo.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.work();
	}

}

class User {
	int age = 88;

	public void work() {
		if (age < 18) {
			throw new MyUnderAgeException("No child labour in this company");

		} else if (age > 60) {
			throw new MyOverAgeException(" you should retire now !");
		}
	}
}
