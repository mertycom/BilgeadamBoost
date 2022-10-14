package com.bilgeadam.boost.week5.lesson1.streamApi;

public class User {
	private int key;
	private String name;
	
	public int getKey() {
		return key;
	}
	
	public void talk() {
		System.out.println("Hi i am "+this.name);
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [key=" + key + ", name=" + name + "]";
	}

}
