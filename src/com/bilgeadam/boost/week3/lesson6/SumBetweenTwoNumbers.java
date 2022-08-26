package com.bilgeadam.boost.week3.lesson6;

import java.util.Scanner;

public class SumBetweenTwoNumbers {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
		int firstNumber = scanInt();
		int secondNumber = scanInt();
		
		if (isSmall(firstNumber,secondNumber)) {
			int sum = sumBetweenNumbers(firstNumber,secondNumber);
			System.out.println("Sum total: "+ sum);
		} else {
			System.out.println("Result : "+firstNumber);
		}
		
		}while(askDoItAgain());
		System.out.println("Bye...");
	}
	
	private static boolean askDoItAgain() {
		System.out.print("\nWould you like to run it again ? Y/N: ");
		String str = sc.next();
		if (str.equalsIgnoreCase("Y"))
			return true;
		return false;
	}
	
	public static int sumBetweenNumbers(int x,int y) {
		int sum=0;
		for (int i=0;i<(y-x+1);i++) {
			sum += x + i;
		}
		return sum;
	}

	private static boolean isSmall(int x, int y) {
		if (x<y)
			return true;
		return false;
		
	}

	private static int scanInt() {
		System.out.print("Enter a number: ");
		int number =sc.nextInt();
		return number;
	}
}
