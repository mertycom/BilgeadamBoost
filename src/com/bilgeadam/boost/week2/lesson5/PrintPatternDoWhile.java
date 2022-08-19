package com.bilgeadam.boost.week2.lesson5;

import java.util.Scanner;

public class PrintPatternDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String answer ="";
		do {
			
			System.out.print("Number: ");
			if(sc.hasNextInt()){
				int x = sc.nextInt();
			
				for(int i=0; i<x ; i++) {
					for(int j=i; j>0 ; j--) {
						System.out.print("*");
			    }
			    System.out.println("*");
				}
			}else {
				System.out.println("Wrong input!!!");
				sc.next();
			}
			System.out.print("Try Again Y/N ? : ");
			answer=sc.next();
		} while (answer.equalsIgnoreCase("Y"));
		sc.close();
	}
	
}
