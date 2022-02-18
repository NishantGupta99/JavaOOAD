package com.learn;

import java.util.ArrayList;

public class listDemo {
	public static void main(String[] args) {
		
	
	// list which will take only string data type
	ArrayList<String> list1 = new ArrayList<String>();
	// a  list which will take all kinds of data type 
	ArrayList list2 = new ArrayList();
	// to add data to the list 
	list1.add("Nishant");
	list1.add("Gupta");
	list1.add("john");
	list1.add("peter");
	list1.add("george");
	list1.add("Nishant");
	
	System.out.println(list1);
	// to get data from the list
	String myName = list1.get(0);
	
	System.out.println(myName);
	
	// to update data from the list 
	
	list1.set(5,"Pariwesh");
	System.out.println(list1.get(5));
	
	// remove element 
	
	list1.remove(2);
	System.out.println(list1);
	}
}
