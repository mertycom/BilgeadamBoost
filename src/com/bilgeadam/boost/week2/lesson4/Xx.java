package com.bilgeadam.boost.week2.lesson4;

import java.util.Scanner;

public class Xx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		}
		sc.close();
	}
}

