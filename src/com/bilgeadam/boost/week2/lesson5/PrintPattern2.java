package com.bilgeadam.boost.week2.lesson5;

import java.util.Scanner;

public class PrintPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, i, j;
		System.out.print("Number: ");
		x = sc.nextInt() - 1;

		System.out.println("*");
		for (i = 0; i < x; i++) {
			for (j = i; j > 0; j--) {
				System.out.print("**");
			}
			System.out.println("**");
		}
	}

}
