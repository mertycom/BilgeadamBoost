package com.bilgeadam.boost.week5.lesson3;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
	public static void main(String[] args) {
		Doktor d1 = new Doktor("Emre", "Ilgar", 20000);
		Doktor d2 = new Doktor("Abuzer", "Kadayif", 18500);
		
		Janitor j1 = new Janitor("Ali", "Veli", 4950);
		Janitor j2 = new Janitor("Eray", "Yapici", 5550);
		
		Manager m1 = new Manager("Alican", "Erkal", 30000);
		Manager m2 = new Manager("Fevzi", "Kaan", 32000);
		
		Nurse n1 = new Nurse("Esra", "Ersoy", 16000);
		Nurse n2 = new Nurse("Ceyda", "Ersoy", 16000);
		
		List<People> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(j1);
		list.add(j2);
		list.add(n1);
		list.add(n2);
		list.add(m1);
		list.add(m2);
		
		for (People people : list) {
			System.out.println(people);
		}
		
		System.out.println();
		
		List<People> managerList = list.stream()
				.filter((person -> person.getJob().equals("Manager")))
				.collect(Collectors.toList());
		
		managerList.stream().forEach(people -> System.out.println(people));
		
	}
}
