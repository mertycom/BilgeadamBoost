package com.bilgeadam.boost.week3.lesson6;

import java.util.Scanner;

public class EvenNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			int number = scNumber();
			System.out.println(isEven(number));
		} while (askDoItAgain());
	}

	private static boolean askDoItAgain() {
		System.out.println("Would you like to run it again ? Y/N: ");
		String str = sc.next();
		if (str.equalsIgnoreCase("Y"))
			return true;
		return false;
	}

	private static String isEven(int number) {
		if (number % 2 == 0)
			return "Even";
		return "Odd";
	}

	private static int scNumber() {
		System.out.println("Sayi girin: ");
		int number = sc.nextInt();
		return number;
	}
}
