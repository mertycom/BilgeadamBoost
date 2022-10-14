package com.bilgeadam.boost.week5.lesson3;

public class Manager extends People implements SalaryRaise{

	public Manager(String name, String lastName, int salary) {
		super(name, lastName, "Manager", salary);
	}

	@Override
	public int salaryRaise() {
		return (int)(this.getSalary()*1.4);
	}



}
