package com.bilgeadam.boost.OYSboost1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.bilgeadam.boost.OYSboost1.entity.Employe;
import com.bilgeadam.boost.OYSboost1.entity.School;

public class BAUtils implements Serializable {
	private static final long serialVersionUID = -6986777068267213837L;

	public final static String MAIN_WORKING_DIRECTORY = "C:\\Users\\snozd\\eclipse-workspace\\BilgeAdam\\src\\com\\bilgeadam\\boost\\OYSboost1";
	public static final File EMPLOYEE_COUNTER_PATH = new File(MAIN_WORKING_DIRECTORY, "Employee.dat");
	public static final File STUDENT_COUNTER_PATH = new File(MAIN_WORKING_DIRECTORY, "Student.dat");
	public static final File SCHOOL_OBJECT_PATH = new File(MAIN_WORKING_DIRECTORY, "School.dat");
	public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

	public static void writeSerializedObject (School school) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_COUNTER_PATH));) {
			oos.writeObject(school);
			System.out.println("The Object  was succesfully written to a file");
		} catch (FileNotFoundException e) {
			System.err.println("Object not created <<<" + e.getMessage() + ">>>");
		} catch (IOException e1) {
			System.err.println("Error serializing contacts: <<<" + e1.getMessage() + ">>>");
		}
	}

	public static School readSerializedObject() {
		School obj = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EMPLOYEE_COUNTER_PATH));) {
			obj = (School) ois.readObject();
		} catch (FileNotFoundException ex) {
			System.out.println("...");
		} catch (EOFException ex) {
			System.out.println("...");
		} catch (IOException ex) {
			System.out.println("...");
		} catch (ClassNotFoundException ex) {
			System.out.println("...");
		}
		return obj;
	}
	
	public static void writeInt(File file, int number) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
			bufferedWriter.write(Integer.toString(number));
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int readInt(File file) {
		int read = -1;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			read = Integer.parseInt(bufferedReader.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return read;
	}
	
}
