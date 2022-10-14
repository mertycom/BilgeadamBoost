package com.bilgeadam.boost.OYSboost1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School implements Serializable {

	private static final long serialVersionUID = 1L;

	public static List<Employe> employe;
	public static List<Student> students;
	public static List<Lesson> lessons;

	public School() {
		School.employe = new ArrayList<Employe>();
		School.students = new ArrayList<Student>();
		School.lessons = new ArrayList<Lesson>();
	}

	public List<Employe> getEmploye() {
		return employe;
	}

	public void addEmploye(Employe employee) {
		School.employe.add(employee);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student students) {
		School.students.add(students);
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void addLessons(Lesson lessons) {
		School.lessons.add(lessons);
	}

	public Student getStudent(String registrationNumber) {
		return School.students.stream().filter(i -> i.getId().equalsIgnoreCase(registrationNumber)).collect(Collectors.toList()).get(0);
	}

}
