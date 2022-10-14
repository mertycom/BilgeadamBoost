package com.bilgeadam.boost.week5.lesson1.streamApi;

public class Person {

	String name;
	String lastname;
	String gender;
	int age;

	public void Speak() {
		System.out.println("Hi !, I am " + this.name);

	}

	public Person(String name, String lastname, String gender, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age + "]";
	}
}
