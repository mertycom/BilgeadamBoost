package com.bilgeadam.boost.OYSboost1.entity;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.boost.OYSboost1.BAUtils;



public class Student extends People implements Serializable {
	private static final long serialVersionUID = 1L;
	private String registrationNumber;
	private int parentPhone;
	private static int idcounter = 1;
	private String id;
	private String classRoom;
	private List<Lesson> lessons;

	public Student(NameSurname name, Gender gender, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			boolean married, double homePhone, double mobilePhone, int parentPhone) throws StudentMarriedException {
		super(name, gender, birthDay, startDate, endDate, married, homePhone, mobilePhone);
		isMaried();
		Student.idcounter++;
		this.id=this.setId();
		this.parentPhone = parentPhone;
		this.classRoom = classRoom;
		lessons = new ArrayList<Lesson>();
		this.registrationNumber = assignRegistrationNumber();
	}

	public String assignRegistrationNumber() {
		int num = BAUtils.readInt(BAUtils.STUDENT_COUNTER_PATH);
		String regNum = String.format("%d-%03d", super.getStartDate().getYear(), num);
		BAUtils.writeInt(BAUtils.STUDENT_COUNTER_PATH, ++num);
		return regNum;
	}

	@Override
	public void isMaried() throws StudentMarriedException {
		if(super.getMarried()) {
			throw new StudentMarriedException(this.getName() + " can't be married!!");
		}
	}
	
	public String setId() {
		String number = String.format("%03d", Student.idcounter);
		return "S" + number;
	}

	public int getParentPhone() {
		return parentPhone;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return id+"-["+ super.toString() +" parentPhone=" + parentPhone + "]";
	}

}
