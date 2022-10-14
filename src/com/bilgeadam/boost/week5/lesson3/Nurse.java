package com.bilgeadam.boost.week5.lesson3;

public class Nurse extends People implements SalaryRaise{

	public Nurse(String name, String lastName, int salary) {
		super(name, lastName,"Nurse", salary);
	}

	@Override
	public int salaryRaise() {
		return (int)(this.getSalary()*1.2);
	}



}
