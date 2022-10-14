package com.bilgeadam.boost.OYSboost1;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import com.bilgeadam.boost.OYSboost1.entity.Employe;
import com.bilgeadam.boost.OYSboost1.entity.Gender;
import com.bilgeadam.boost.OYSboost1.entity.NameSurname;
import com.bilgeadam.boost.OYSboost1.entity.Officer;
import com.bilgeadam.boost.OYSboost1.entity.School;
import com.bilgeadam.boost.OYSboost1.entity.Servant;
import com.bilgeadam.boost.OYSboost1.entity.Student;
import com.bilgeadam.boost.OYSboost1.entity.StudentMarriedException;
import com.bilgeadam.boost.OYSboost1.entity.Teacher;

public class test {
	private static Scanner sc = new Scanner(System.in);
	private static School schoolx;

	public static void main(String[] args) {
		while (true) {
			schoolx = getSchoolDatas();
			showMenuItems();
			int option = sc.nextInt();
			makeChoice(option);
		}
	}
	
	private static School getSchoolDatas() {
		School school1 = BAUtils.readSerializedObject();
		if (school1 != null) {
			return school1;
		} else
			return new School();
	}

	@SuppressWarnings("unused")
	private static void extracted() {

		try {
			for (Employe employe : School.employe) {
				System.out.println(employe);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			Student stu1 = new Student(new NameSurname("Mert", "Comert"), Gender.MALE, LocalDate.of(1990, 1, 31),
					LocalDate.of(2022, 7, 5), null, true, 212, 211, 222);
			schoolx.addStudents(stu1);
		} catch (StudentMarriedException e) {
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		}

		for (Student student : School.students) {
			System.out.println(student);
		}
	}

	private static void newEmployes() {

		Employe teacher1 = new Teacher(new NameSurname("Mert", "Comertoglu"), Gender.MALE, LocalDate.of(1990, 1, 31),
				LocalDate.of(2020, 8, 1), null, true, 2100, 543555, 5555);
		Employe teacher2 = new Teacher(new NameSurname("Emre", "Ilgar"), Gender.MALE, LocalDate.of(1990, 10, 3),
				LocalDate.of(2022, 1, 1), null, true, 2100, 543555, 5555);
		Employe teacher3 = new Teacher(new NameSurname("Huseyin", "Cancik"), Gender.MALE, LocalDate.of(1999, 10, 3),
				LocalDate.of(2020, 1, 1), LocalDate.of(2020, 5, 1), true, 2100, 543555, 5555);
		schoolx.addEmploye(teacher1);
		schoolx.addEmploye(teacher2);
		schoolx.addEmploye(teacher3);

		Employe officer1 = new Officer(new NameSurname("Ayse", "Fatma", "Bakkal"), Gender.FEMALE,
				LocalDate.of(1990, 1, 31), LocalDate.of(2020, 8, 1), null, true, 2100, 543555, 5555);
		Employe officer2 = new Officer(new NameSurname("Ferhat", "Yilmaz"), Gender.MALE, LocalDate.of(1990, 10, 3),
				LocalDate.of(2022, 1, 1), null, true, 2100, 543555, 5555);
		Employe officer3 = new Officer(new NameSurname("Fatma", "Cancik"), Gender.FEMALE, LocalDate.of(1989, 4, 3),
				LocalDate.of(2025, 1, 1), LocalDate.of(2022, 5, 1), true, 2100, 543555, 5555);
		schoolx.addEmploye(officer1);
		schoolx.addEmploye(officer2);
		schoolx.addEmploye(officer3);

		Employe servant1 = new Servant(new NameSurname("Huseyin", "Kiraz"), Gender.MALE, LocalDate.of(1990, 1, 31),
				LocalDate.of(2020, 8, 1), null, true, 2100, 543555, 5555);
		Employe servant2 = new Servant(new NameSurname("Fehime", "Yilmaz"), Gender.FEMALE, LocalDate.of(1990, 10, 3),
				LocalDate.of(2022, 1, 1), null, true, 2100, 543555, 5555);
		Employe servant3 = new Servant(new NameSurname("Fadime", "Holosklo"), Gender.FEMALE, LocalDate.of(1989, 4, 3),
				LocalDate.of(2025, 1, 1), LocalDate.of(2022, 5, 1), true, 2100, 543555, 5555);
		schoolx.addEmploye(servant1);
		schoolx.addEmploye(servant2);
		schoolx.addEmploye(servant3);

		BAUtils.writeSerializedObject(schoolx);
	}


	public static void makeChoice(int choice) {
		switch (choice) {
		case 1:
			newEmployes();
			System.out.println("Employees added.");
			break;
		case 2:
			listEmployees(schoolx.getEmploye());
			break;
		case 3:
			listOldEmployees(schoolx.getEmploye());
			break;
		case 4:
			// newLessons(school.getEmployees());
			break;
		case 5:
			// newStudents();
			break;
		case 6:
			// lessonsList(school.getLessons());
			break;
		case 7:
			// studentsLessons();
			break;
		case 8:
			// giftList();
			break;
		case 9:
			// calculateSalary();
			break;
		case 10:
			// endLoop();
			break;
		default:
			System.out.println("Wrong input! Try Again");
		}
	}

	private static void listOldEmployees(List<Employe> employeList) {
		List<Employe> oldemployeList = employeList.stream().filter(user -> user.getEndDate() != null).toList();
		for (Employe employe : oldemployeList) {
			System.out.println(employe);
		}
	}

	private static void listEmployees(List<Employe> employees) {
		employees.stream().forEach(s -> System.out.println(s));
	}

	public static void showMenuItems() {
		System.out.println("\n#########################################################");
		System.out.println("################  School Managment System  #############");
		System.out.println("#########################################################");

		System.out.println("# 1- Add Employee ");
		System.out.println("# 2- Employee List");
		System.out.println("# 3- Ex-Employees");
		System.out.println("# 4- New Class");
		System.out.println("# 5- Student Assignment");
		System.out.println("# 6- Class List");
		System.out.println("# 7- Classes Attended By The Student ");
		System.out.println("# 8- Gift List");
		System.out.println("# 9- Salary List");
		System.out.println("# 10- Exit System");
		System.out.println("#########################################################");
	}

}
