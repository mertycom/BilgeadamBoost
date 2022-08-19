package com.bilgeadam.boost.week2.lesson3;

import java.util.Scanner;

public class GradeCalculation {
	/* 2 Midterm exam 1 Final exam grade=%40m+%60f
	 * 0-49 FF
	 * 50-59 DD
	 * 60-69 CC
	 * 70-79 BB
	 * 80-100 AA
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First midterm exam: ");
		int m1 = sc.nextInt();
		System.out.print("Second midterm exam: ");
		int m2 = sc.nextInt();
		System.out.print("Final exam: ");
		int f = sc.nextInt();
		
		double note = (((m1+m2)/2)*0.4)+(f*0.6);
		
		if (note<=49 && note>=0) {
			System.out.println("Your note: "+note+" FF");
		}else if(note<=59){
			System.out.println("Your note: "+note+" DD");
		}else if(note<=69){
			System.out.println("Your note: "+note+" CC");
		}else if(note<=79){
			System.out.println("Your note: "+note+" BB");
		}else if(note<=100){
			System.out.println("Your note: "+note+" AA");
		}else {
			System.out.println("Maybe wrong input!! Try again");
		}
		sc.close();
	}

}
