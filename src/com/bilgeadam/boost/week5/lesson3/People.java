package com.bilgeadam.boost.week5.lesson3;

public class People {
	private String name;
	private String lastName;
	private String job;
	private int salary;

	public People(String name, String lastName, String job, int salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

}
