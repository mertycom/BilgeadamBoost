package com.bilgeadam.boost.OYSboost1.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Employe extends People {
	private static final long serialVersionUID = 7811134274470493224L;

	private String id;
	private double startingSalary;
	private double salary;

	public abstract String setId();

	public Employe(NameSurname name, Gender gender, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			boolean married, double startingSalary, double homePhone, double mobilePhone) {
		super(name, gender, birthDay, startDate, endDate, married, homePhone, mobilePhone);
		this.id = this.setId();
		this.startingSalary = startingSalary;
		this.salary = calcCurrentSalary();
	}
	
	protected double calcCurrentSalary(){	
		long years = this.getStartDate().until(LocalDate.now(), ChronoUnit.YEARS);
		double currentSalary = this.getStartingSalary();
		
		for(int i = 0; i<years;i++) {
			currentSalary = currentSalary*(100.0+calcSalaryIncreaseRate())/100;
		}
		
		return currentSalary;	
}
	
	protected abstract double calcSalaryIncreaseRate();

	@Override
	public void isMaried() {
	}

	public double getStartingSalary() {
		return startingSalary;
	}

	public void setStartingSalary(double startingSalary) {
		this.startingSalary = startingSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + "[" + getName() + "," + getGender() + ", startingSalary="
				+ startingSalary + ", currentsalary=" + salary + ", BirthDay=" + getBirthDay() + ", StartDate="
				+ getStartDate() + ", EndDate=" + getEndDate() + ", Married=" + getMarried()
				+ ", HomePhone=" + getHomePhone() + ", MobilePhone=" + getMobilePhone() + "]";
	}

}
