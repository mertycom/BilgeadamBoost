package com.bilgeadam.boost.week2.lesson2;

import java.util.Scanner;

public class ArithmeticExamples2 {

	public static void main(String[] args) {
		
		//girilen iki sayıyı bölme
		
		int number1;
		float number2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		number1 = scan.nextInt();
		System.out.print("Please enter second number: ");
		number2 = scan.nextInt();
		System.out.println("Divide result:"+ number1/number2);
		System.out.println("Remaining:"+ number1%number2);
		
		scan.close();
	}

}
