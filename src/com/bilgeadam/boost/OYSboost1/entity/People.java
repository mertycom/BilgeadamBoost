package com.bilgeadam.boost.OYSboost1.entity;

import java.io.Serializable;
import java.time.LocalDate;


public abstract class People implements Serializable {
	private static final long serialVersionUID = 4562909282785523505L;

	private NameSurname name;
	private Gender gender;
	private LocalDate birthDay;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean married;
	private double homePhone;
	private double mobilePhone;
	private Phone phone;

	public abstract void isMaried() throws StudentMarriedException;

	public People(NameSurname name, Gender gender, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			boolean married, double homePhone, double mobilePhone) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.startDate = startDate;
		this.endDate = endDate;
		this.married = married;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
	}

	public NameSurname getName() {
		return name;
	}

	public void setName(NameSurname name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean getMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public double getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(int homePhone) {
		this.homePhone = homePhone;
	}

	public double getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Override
	public String toString() {
		return name + ", gender=" + gender + ", birthDay=" + birthDay + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", married=" + married + ", homePhone=" + homePhone + ", mobilePhone="
				+ mobilePhone + ", toString()=" + super.toString();
	}

}
