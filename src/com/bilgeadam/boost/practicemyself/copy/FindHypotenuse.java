package com.bilgeadam.boost.practicemyself.copy;

import java.util.Scanner;

public class FindHypotenuse {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side x: ");
		x = sc.nextDouble();
		System.out.print("Enter side y: ");
		y = sc.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is: "+z);

	}

}
