package com.bilgeadam.boost.praticemyself;

import java.util.Scanner;

public class RecursiveFibbonacci {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.print("Sayi girin: ");
			int n = scNumber();
			if (n > 0 && n<40) {
				int x = fib(n);
				System.out.println(x);
			}
		}
	}

	// Dizideki n ninci elemanı gösteren fib metotdu
	private static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	private static int scNumber() {
		int number = sc.nextInt();
		return number;
	}
}
