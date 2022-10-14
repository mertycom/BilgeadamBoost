package com.bilgeadam.boost.OYSboost1.entity;

public class Phone {
	private double mobilePhone;
	private double homePhone;
	private double parentPhone;
	
	public Phone(double mobilePhone, double homePhone) {
		super();
		this.mobilePhone = mobilePhone;
		this.homePhone = homePhone;
	}
	public Phone(double mobilePhone, double homePhone, double parentPhone) {
		super();
		this.mobilePhone = mobilePhone;
		this.homePhone = homePhone;
		this.parentPhone = parentPhone;
	}
	public double getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(double mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public double getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(double homePhone) {
		this.homePhone = homePhone;
	}
	public double getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(double parentPhone) {
		this.parentPhone = parentPhone;
	}
}
