package com.bilgeadam.boost.OYSboost1.entity;

import java.io.Serializable;
import java.util.List;

public class Lesson implements Serializable {
	private static final long serialVersionUID = -4569788897414302923L;
	private Employe masterTrainer;
	private Employe asistantTrainer;
	private String name;
	private String year;
	private List<Student> students;
	private String lessonTime;
	private String lessonDateBetween;
	
	public Lesson(Employe masterTrainer, Employe asistantTrainer, String name, String year, List<Student> students,
			String lessonTime, String lessonDateBetween) {
		this.masterTrainer = masterTrainer;
		this.asistantTrainer = asistantTrainer;
		this.name = name;
		this.year = year;
		this.students = students;
		this.lessonTime = lessonTime;
		this.lessonDateBetween = lessonDateBetween;
	}

	public Employe getMasterTrainer() {
		return masterTrainer;
	}

	public void setMasterTrainer(Employe masterTrainer) {
		this.masterTrainer = masterTrainer;
	}

	public Employe getAsistantTrainer() {
		return asistantTrainer;
	}

	public void setAsistantTrainer(Employe asistantTrainer) {
		this.asistantTrainer = asistantTrainer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getLessonTime() {
		return lessonTime;
	}

	public void setLessonTime(String lessonTime) {
		this.lessonTime = lessonTime;
	}

	public String getLessonDateBetween() {
		return lessonDateBetween;
	}

	public void setLessonDateBetween(String lessonDateBetween) {
		this.lessonDateBetween = lessonDateBetween;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return this.name+"[masterTrainer=" + masterTrainer + ", asistantTrainer=" + asistantTrainer + ", name=" + name
				+ ", year=" + year + ", students=" + students + ", lessonTime=" + lessonTime + ", lessonDateBetween="
				+ lessonDateBetween + "]";
	}
	
	
	
}
