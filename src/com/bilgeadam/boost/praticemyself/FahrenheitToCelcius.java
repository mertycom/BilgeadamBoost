package com.bilgeadam.boost.praticemyself;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		
		//Changing the input value from fahrenheit to celcius
		
		double val;
		double c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a fahrenheit value : ");
		val = scan.nextDouble();
		
		c = (val-32)/1.8;
		
		System.out.print("Celcius: ");
		System.out.format("%.2f", c);
		
		scan.close();

	}

}
