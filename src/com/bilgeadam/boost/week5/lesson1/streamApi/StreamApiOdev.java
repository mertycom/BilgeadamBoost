package com.bilgeadam.boost.week5.lesson1.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOdev {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Whittaker", "Godleman", "Male", 32));
		persons.add(new Person("Merola", "Wrout", "Female", 32));
		persons.add(new Person("Melosa", "Courage", "Female", 14));
		persons.add(new Person("Sydney", "Cullington", "Female", 74));
		persons.add(new Person("Sherwin", "Ogley", "Male", 14));
		persons.add(new Person("Dukie", "Malpass", "Male", 30));
		persons.add(new Person("Jahrrett", "Fearick", "Male", 77));
		persons.add(new Person("Willie", "Childerhouse", "Male", 31));
		persons.add(new Person("Berky", "Tollmache", "Male", 73));
		persons.add(new Person("Nanete", "Blunsden", "Famele", 81));

		// 50 yaşından küçükler
		persons.stream()
				.filter(person -> person.age < 50)
				.forEach(user -> System.out.println(user));
		
		// 35 yaşından küçük erkekler konuşsun
		persons.stream()
				.filter(person -> person.age < 35).filter(person -> person.getGender().equals("Male"))
				.collect(Collectors.toList())
				.forEach(user -> user.Speak());
		
		// erkeklere 15 yaş ekle başka listede göster
		List<Person> filteredList2 = persons.stream()
				.filter(person -> person.getGender().equals("Male"))
				.map(person -> new Person(person.getName(),person.getLastname(),person.getGender(),person.getAge()+15))
				.collect(Collectors.toList());
		
		filteredList2.stream().forEach(user -> System.out.println(user));
		
	}
}
