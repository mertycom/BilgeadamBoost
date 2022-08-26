package com.bilgeadam.boost.praticemyself;

import java.util.Scanner;

public class RecursiveRow {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Math.pow(x,y)
		System.out.print("Base: ");
		int x = scNumber();
		System.out.print("Exponent: ");
		int y = scNumber();
		
		int result = (int)Math.pow(x,y);
		System.out.println(result);
		
		result= pow(x,y);
		System.out.println(result);

	}

	private static int pow(int x, int y) {
		if(x==0)
			return 0;
		if(x==1 || y==0)
			return 1;
		if(y==1)
			return x;
		return x*pow(x,y-1);
	}

	private static int scNumber() {
		int number = sc.nextInt();
		return number;
	}
}
