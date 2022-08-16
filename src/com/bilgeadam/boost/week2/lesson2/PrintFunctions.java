package com.bilgeadam.boost.week2.lesson2;

import javax.swing.JOptionPane;

public class PrintFunctions {

	public static void main(String[] args) {
		String hello = "Hello";
		String world = "World!!";
		
		System.out.println(hello);	
		System.out.println(hello+world);
		System.out.println(hello+" "+world);
		
		JOptionPane.showMessageDialog(null, hello+" "+world,"First JOptionPane",JOptionPane.ERROR_MESSAGE);
		
	}

}
