package com.bilgeadam.boost.week2.lesson3;

import java.util.Scanner;

public class PolygonArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of side: "); //kenar sayisi
		int e = scan.nextInt();
		System.out.print("Side Lenght: "); //kenar uzunluğu
		int l = scan.nextInt();		
		
		//area calculation
		double area = (e*(l*l))/(4*(Math.tan(Math.PI/e)));
		
		System.out.print("Area :");
		System.out.format("%.2f", area);
		scan.close();
		

	}

}
