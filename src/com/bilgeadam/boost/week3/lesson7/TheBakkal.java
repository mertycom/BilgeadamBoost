package com.bilgeadam.boost.week3.lesson7;

import java.util.Scanner;

public class TheBakkal {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		TheBakkal bakkal = new TheBakkal();
		bakkal.menu();
		System.out.println("Bakkalımızı ziyaret ettiginiz için teşekkürler");
	}

	private void menu() {

		while (true) {
			System.out.println("================");
			System.out.println(" Kardesler Gida ");
			System.out.println("================\n");
			System.out.println("1- Yeni urun girisi");
			System.out.println("2- Urunleri listele");
			System.out.println("3- Alisveris yap");
			System.out.println("4- Eve don");
			System.out.print("\nLuften giris yapiniz: ");
			int selection=sc.nextInt();
			if (selection==4) {
				break;
			}
		}

	}
}
