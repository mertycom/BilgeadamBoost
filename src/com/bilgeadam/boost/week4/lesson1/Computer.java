package com.bilgeadam.boost.week4.lesson1;

public class Computer {

	
	private String brand;
	private int ramSize;
	private int ssdCapacity;
	private double scrennSize;
	private String operatingSystem;

	void connectWeb() {
		System.out.println(brand + " connected to web.");
	}

	void showFeatures() {
		System.out.println("Computer [brand=" + brand + ", ramSize=" + ramSize + ", ssdCapacity=" + ssdCapacity
				+ ", scrennSize=" + scrennSize + ", operatingSystem=" + operatingSystem + "]");
	}
	
	public Computer() {
		super();
	}

	public Computer(String brand, int ramSize, int ssdCapacity, double scrennSize, String operatingSystem) {
		super();
		this.brand = brand;
		this.ramSize = ramSize;
		this.ssdCapacity = ssdCapacity;
		this.scrennSize = scrennSize;
		this.operatingSystem = operatingSystem;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getSsdCapacity() {
		return ssdCapacity;
	}

	public void setSsdCapacity(int ssdCapacity) {
		this.ssdCapacity = ssdCapacity;
	}

	public double getScrennSize() {
		return scrennSize;
	}

	public void setScrennSize(double scrennSize) {
		this.scrennSize = scrennSize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
