package com.bilgeadam.boost.week4.lesson3.hospital;

public abstract class Person {
	private String name;
	private int age;
	private boolean healty;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	abstract void healtyOrNot();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHealty() {
		return healty;
	}

	public void setHealty(boolean healty) {
		this.healty = healty;
	}
	
}
