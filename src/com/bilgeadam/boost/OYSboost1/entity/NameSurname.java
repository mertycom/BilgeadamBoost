package com.bilgeadam.boost.OYSboost1.entity;

public class NameSurname {
	private String name;
	private String middleName;
	private String surname;
	
	public NameSurname(String name, String middleName, String surname) {
		this.name = name;
		this.middleName = middleName;
		this.surname = surname;
	}
	public NameSurname(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}

	public String getMiddleName() {
		return middleName;
	}
	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		if(middleName==null) {
			return name +  ", " + surname ;
		}
		return name + ", " + middleName + ", " + surname ;
	}
	
}
