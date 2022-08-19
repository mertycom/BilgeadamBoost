package com.bilgeadam.boost.praticemyself;

import java.util.Scanner;

public class PriceCalculation {

	public static void main(String[] args) {
		
		//Raw price calculation
		
		int number;
		double withoutvat, rawprice, vat;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter end price: ");
		number = scan.nextInt();
		//Vat
		vat = number*18/100;
		//Without Vat
		withoutvat = number*100/(100+18);
		//raw price
		rawprice =withoutvat*100/(100+15);
		
		System.out.print("Vat :");
		System.out.format("%.2f", vat);
		System.out.print("\nWithout Vat :");
		System.out.format("%.2f", withoutvat);
		System.out.print("\nRaw Price :");
		System.out.format("%.2f", rawprice);
		
		
		scan.close();
		
	}
	
}
