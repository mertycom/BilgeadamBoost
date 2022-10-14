package com.bilgeadam.boost.OYSboost1.entity;

import java.time.LocalDate;

public class Servant extends Employe {
	private static final long serialVersionUID = -8807185949282567805L;
	private static int idcounter = 1;

	public Servant(NameSurname name, Gender gender, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			boolean married, double startingSalary, double homePhone, double mobilePhone) {
		super(name, gender, birthDay, startDate, endDate, married, startingSalary, homePhone, mobilePhone);
		idcounter++;
	}

	@Override
	public String setId() {
		String number = String.format("%03d", Servant.idcounter);
		return "S" + number;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected double calcSalaryIncreaseRate() {
		return 8.0;
	}

}
