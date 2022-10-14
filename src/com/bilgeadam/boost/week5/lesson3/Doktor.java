package com.bilgeadam.boost.week5.lesson3;

public class Doktor extends People implements SalaryRaise{

	public Doktor(String name, String lastName, int salary) {
		super(name, lastName, "Doktor", salary);
	}

	@Override
	public int salaryRaise() {
		int newSalary = (int)(this.getSalary()*1.3);
		return newSalary;
	}	
}
