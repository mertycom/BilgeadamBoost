package com.bilgeadam.boost.week5.lesson2;

public class Exceptionss {
	public static void main(String[] args) {
		try {
			int divideByZero = 5 / 0;
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException verdi!");
		}
		
		try {
			String s = null;
			System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println("NullPointerException verdi!");
		} finally {
			System.out.println("kod u iptal etti");
		}
	}
}
