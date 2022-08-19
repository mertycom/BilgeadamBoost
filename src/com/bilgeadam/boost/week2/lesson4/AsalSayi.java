package com.bilgeadam.boost.week2.lesson4;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int x = sc.nextInt();
		int sayac = 0;
		
		for(int i=2;i<x;i++) {
			if(x%i ==0) {
				sayac++;
			}
		}
        if(sayac == 0) {
            System.out.println(x + " Asal bir sayidir.");
        } else {
            System.out.println(x + " Asal bir sayi degildir.");
        }
        sc.close();
	}
}


