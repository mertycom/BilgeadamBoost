package com.bilgeadam.boost.week2.lesson2;

import java.util.Scanner;

public class ArithmeticExamples {

	public static void main(String[] args) {
		
		//girilen bir sayıyı bir arttırma
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		number = scan.nextInt();
		System.out.println("Increased by one :"+ ++number);
		
		scan.close();
	}

}
