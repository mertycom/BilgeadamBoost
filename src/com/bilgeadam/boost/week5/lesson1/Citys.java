package com.bilgeadam.boost.week5.lesson1;

public class Citys {
	private int plateNo;
	private String city;
	private String famousDish;

	public String getCity() {
		return city;
	}

	public String getFamousDish() {
		return famousDish;
	}

	public Citys(String city, String famousDish,int plateNo) {
		super();
		this.city = city;
		this.famousDish = famousDish;
		this.plateNo = plateNo;
	}

	@Override
	public String toString() {
		return "Citys [Plaka= " + plateNo + ", Sehir= " + city + ", Meshur Yemek = " + famousDish + "]";
	}

	public int getPlateNo() {
		return plateNo;
	}


}
