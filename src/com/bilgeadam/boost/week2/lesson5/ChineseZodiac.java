package com.bilgeadam.boost.week2.lesson5;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer=null,zodiac=null;
		
		do{
		System.out.print("Year of birht? : ");
		int x = sc.nextInt();
		int operator = x%12;
		
			switch (operator) {		
				case 0:
					zodiac="Maymun";
					break;
				case 1:
					zodiac="Horoz";
					break;
				case 2:
					zodiac="Köpek";
					break;
				case 3:
					zodiac="Domuz";
					break;
				case 4:
					zodiac="Fare";
					break;
				case 5:
					zodiac="Öküz";
					break;
				case 6:
					zodiac="Kaplan";
					break;
				case 7:
					zodiac="Tavsan";
					break;
				case 8:
					zodiac="Ejderha";
					break;
				case 9:
					zodiac="Yılan";
					break;
				case 10:
					zodiac="At";
					break;
				case 11:
					zodiac="Koyun";
					break;
				default:
					zodiac="Invalid operator!";
			}
			System.out.println("Your zodiac is "+zodiac);
			System.out.print("Try Again Y/N ? : ");
			answer=sc.next();
		}while(answer.equalsIgnoreCase("Y"));
		sc.close();

	}

}
