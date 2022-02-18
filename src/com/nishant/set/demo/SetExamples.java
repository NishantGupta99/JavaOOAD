package com.nishant.set.demo;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
		demo1();
		treeSetDemo();
	}

	private static void treeSetDemo() {
		// TODO Auto-generated method stub

	}

	private static void demo1() {
		// TODO Auto-generated method stub
		Set<User> users = createSet();
		System.out.println(users);
		User userWithTheSameAge = new User();
		userWithTheSameAge.setAge(10);
		users.add(userWithTheSameAge);
		;
		System.out.println(users);

	}

	private static Set<User> createSet() {
		Set<User> users = new HashSet<User>();
		for (int i = 0; i < 30; i++) {
			User user = new User();
			user.setAge(10 + i);
			users.add(user);

		}

		return users;

	}

}
