package com.bilgeadam.boost.week2.lesson3;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x,y,c,lx,ly,lc ;
		
		System.out.print("First angle: ");
		x = scan.nextDouble();
		System.out.print("Edge lenght: ");
		lx = scan.nextDouble();
		System.out.print("Second angle: ");
		y = scan.nextDouble();
		System.out.print("Edge lenght: ");
		ly = scan.nextDouble();

		c=180-x-y;
		double rc = Math.toRadians(c);
		
		lc = Math.sqrt ((lx*lx)+(ly*ly)-(2*lx*ly*(Math.cos(rc))));
		
		System.out.println("Angle: "+c);
		System.out.println("Lenght: "+lc);
		
		scan.close();
		
	}
}
