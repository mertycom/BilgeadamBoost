package com.bilgeadam.boost.week5.lesson1;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		
		Map<Integer, Citys> mapCitysWPlate = new HashMap<>();
		
		Citys city = new Citys("Gaziantep", "Baklava",27);
		mapCitysWPlate.put(city.getPlateNo(), city);

		city = new Citys("Kilis", "Kilis Tava",79);
		mapCitysWPlate.put(city.getPlateNo(), city);

		city = new Citys("Adana", "Adana Kebap",01);
		mapCitysWPlate.put(city.getPlateNo(), city);

		city = new Citys("Adiyaman", "Cig Kofte",02);
		mapCitysWPlate.put(city.getPlateNo(), city);

		city = new Citys("Bursa", "Iskender",16);
		mapCitysWPlate.put(city.getPlateNo(), city);

		System.out.println(mapCitysWPlate.get(27));
		System.out.println(mapCitysWPlate.get(1));
	}
}
