package com.bilgeadam.boost.week2.lesson2;

import java.util.Scanner;

public class ArithmeticExamples3 {

	public static void main(String[] args) {
		
		//girilen iki sayıyı bölme
		
		int number1;
		int number2;
		int number3;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		number1 = scan.nextInt();
		System.out.print("Please enter second number: ");
		number2 = scan.nextInt();
		System.out.print("Please enter third number: ");
		number3 = scan.nextInt();
		System.out.println("A*(B+C) result:"+ number1*(number2+number3));

	}

}
