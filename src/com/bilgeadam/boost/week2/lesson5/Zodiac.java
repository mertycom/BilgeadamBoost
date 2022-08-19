package com.bilgeadam.boost.week2.lesson5;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your birthday (DDMM): ");
		int answer = sc.nextInt();
		String zodiac=null;
		int day = answer / 100;
		int month = answer - (100*day);
		
		boolean aquarius = (month==1&&(day>=21))||(month==2&&(day<=19));
		boolean Pisces = (month==2&&(day>=20))||(month==3&&(day<=20));
		boolean Aries = (month==3&&(day>=21))||(month==4&&(day<=20));
		boolean Taurus = (month==4&&(day>=21))||(month==5&&(day<=21));
		boolean Gemini = (month==5&&(day>=22))||(month==6&&(day<=21));
		boolean Cancer = (month==6&&(day>=22))||(month==7&&(day<=22));
		boolean Leo = (month==7&&(day>=23))||(month==8&&(day<=21));
		boolean Virgo = (month==8&&(day>=22))||(month==9&&(day<=23));
		boolean Libra = (month==9&&(day>=24))||(month==10&&(day<=23));
		boolean Scorpio = (month==10&(day>=24))||(month==11&&(day<=22));
		boolean Capricorn = (month==12&&(day>=23))||(month==1&&(day<=20));
		boolean Sagittarius = (month==11&&(day>=23))||(month==12&&(day<=22));

		
		
		if (aquarius) {
			zodiac = "Aquarius";
		}if (Pisces) {
			zodiac = "Pisces";
		}if (Scorpio) {
			zodiac = "Scorpio";
		}if (Cancer) {
			zodiac = "Cancer";
		}if (Libra) {
			zodiac = "Libra";
		}if (Gemini) {
			zodiac = "Gemini";
		}if (Capricorn) {
			zodiac = "Capricorn";
		}if (Virgo) {
			zodiac = "Virgo";
		}if (Taurus) {
			zodiac = "Taurus";
		}if (Sagittarius) {
			zodiac = "Sagittarius";
		}if (Leo) {
			zodiac = "Leo";
		}if (Aries) {
			zodiac = "Aries";
		}
		
		if (month<=12 && day<32 && day!=0 && month!=0) {
			System.out.println("Day: "+day+" Month: "+month+" Your zodiac is "+zodiac);
			sc.close();
		}else {
			System.out.println("Wrong input please try again");
		}
	}

}
