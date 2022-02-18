package com.nishant.entity;

import java.util.ArrayList;
import java.util.List;

public class Gym {
	static List<User> users = new ArrayList<User>();

	public static void main(String[] args) {

		createUsers();
	}

	private static void createUsers() {
		for (int i = 0; i < 10; i++) {
			User u1 = new User("Nishant", 547881256L, (byte)(10*i));
//			u1.setAge((byte) (10 + i));
//			u1.setName("Nishant" +i );
			users.add(u1);

		}
		System.out.println(users);
		users.get(0).workout();
	}

}
