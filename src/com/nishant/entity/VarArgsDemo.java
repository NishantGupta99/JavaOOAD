package com.nishant.entity;

public class VarArgsDemo {
	public static void main(String[] args) {
		String[] subjects= {"Maths", "physics", "Chemistry", "English"};
		Student student = new Student(subjects);
		System.out.println(student.subjects[3]);
		
		Student student1 = new Student("IT");
		System.out.println(student1.subjects[0]);
	}

}
class Student {
	String[] subjects;
	
	public Student(String... subjects) { // Var args
		this.subjects = subjects;
		
		
	}
	
	
}