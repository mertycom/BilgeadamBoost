package com.bilgeadam.boost.week3.lesson6;

import java.util.Scanner;


public class SmallNumber {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = scInt();
		int y = scInt();
		int smallNumber = findSmallNumber(x,y);
		System.out.println("Kucuk Sayi :"+ smallNumber);
		sc.close();
	}

	private static int findSmallNumber(int x,int y) {
		if (x<y)
			return x;
		return y;
	}
	
	private static int scInt() {
		System.out.println("Sayi girin: ");
		int number =sc.nextInt();
		return number;
	}
}
