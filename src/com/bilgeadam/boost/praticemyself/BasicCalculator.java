package com.bilgeadam.boost.praticemyself;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("First number: ");
		int x = sc.nextInt();
		System.out.print("Second number: ");
		int y = sc.nextInt();
		System.out.print("Choose an operator: +, -, *, or / : ");
	    char operator = sc.next().charAt(0);
				
		switch (operator) {		
			case '+':
				System.out.println(x+"+"+y+"= "+(x+y) );
				break;
			case '-':
				System.out.println(x+"-"+y+"= "+(x-y) );
				break;
			case '*':
				System.out.println(x+"*"+y+"= "+(x*y) );
				break;
			case '/':
				System.out.println(x+"/"+y+"= "+(x/y) );
				break;
			default:
		        System.out.println("Invalid operator!");	
		}
	sc.close();
	}

}
