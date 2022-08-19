package com.bilgeadam.boost.week2.lesson4;

import java.util.Scanner;

public class AgeEvaluator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Yasiniz? : ");
		int age = sc.nextInt();
		
		if (age<18) {
			System.out.println("Cocuk");
		} 
		else if (age<30) {
			System.out.println("Genc");
		} 
		else if (age<50) {
			System.out.println("Orta Yasli");
		} 
		else {
			System.out.println("Yasli");
		}
		
		sc.close();
	}

}
