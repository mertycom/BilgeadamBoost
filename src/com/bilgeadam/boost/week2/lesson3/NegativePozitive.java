package com.bilgeadam.boost.week2.lesson3;

import java.util.Scanner;

public class NegativePozitive {
		
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = scan.nextInt();
		
		if(x>0){
			System.out.println("x is positive");
		}else if (x<0) {
			System.out.println("x is negative");
		}else{
			System.out.println("x is neutral");
		}
	  scan.close();
	}
}