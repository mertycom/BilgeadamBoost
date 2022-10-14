package com.bilgeadam.boost.week5.lesson3;

public class Janitor extends People implements SalaryRaise{

	public Janitor(String name, String lastName, int salary) {
		super(name, lastName, "Janitor", salary);
	}

	@Override
	public int salaryRaise() {
		return (int)(this.getSalary()*1.1);
	}

}
