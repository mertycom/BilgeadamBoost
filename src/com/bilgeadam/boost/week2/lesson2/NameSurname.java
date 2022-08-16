package com.bilgeadam.boost.week2.lesson2;

import javax.swing.JOptionPane;

public class NameSurname {
	public static void main(String[] args) {
	String name = "Baris Mert";
	String sname = "Comertoglu";

	System.out.println(name+" "+sname);
	System.out.println(name);
	System.out.println(sname);
	
	JOptionPane.showInternalMessageDialog(null, "Oops. Something went wrong.", "System Error", 0);
	}
}
