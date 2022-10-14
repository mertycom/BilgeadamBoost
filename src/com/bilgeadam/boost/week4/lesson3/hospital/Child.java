package com.bilgeadam.boost.week4.lesson3.hospital;

import java.util.Scanner;

public class Child extends Person {
	static Scanner sc = new Scanner(System.in);

	public Child(String name, int age) {
		super(name, age);
	}

	@Override
	void healtyOrNot() {
		System.out.println("Are you feel healty? (Y/N): ");
		if (sc.nextLine().equalsIgnoreCase("Y")) {
			setHealty(true);
		}else {
			setHealty(false);
		}
	}
	
	void childInfo() {
		System.out.print("Please enter your name: ");
		setName(sc.nextLine());
		System.out.println("Enter your age: ");
		setAge(sc.nextInt());
		sc.nextLine();
	}
	
	void vaccine() {
		System.out.println("1st dose of vaccine complited");
	}
	
	

}
