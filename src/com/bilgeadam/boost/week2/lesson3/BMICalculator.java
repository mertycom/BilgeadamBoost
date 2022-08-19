package com.bilgeadam.boost.week2.lesson3;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Your length: ");
		double l = sc.nextDouble();
		System.out.print("Your weight (Kg): ");
		double w = sc.nextDouble();
		sc.nextLine();
		System.out.print("Your gender M/F: ");
		String g = sc.nextLine();
		
		double bmi = w*10000/(Math.pow(l, 2));
		
		//male bmi calculator
		
		if (g.equalsIgnoreCase("M")) {
			if (bmi<20) {
				System.out.println("BMI: "+bmi+" Thin");
			} else if (bmi<=25){
				System.out.println("BMI: "+bmi+" Normal");
			} else if (bmi<=30){
				System.out.println("BMI: "+bmi+" Overweight");
			} else {
				System.out.println("BMI: "+bmi+" Obese");
			}
		}
			//female bmi calculator
		else if (g.equalsIgnoreCase("F")) {
			
			if (bmi<19) {
				System.out.println("BMI: "+bmi+" thin");
			} else if (bmi<=24){
				System.out.println("BMI: "+bmi+" normal");
			} else if (bmi<=30){
				System.out.println("BMI: "+bmi+" overweight");
			} else {
				System.out.println("BMI: "+bmi+" obese");
			}
		}
		else {
			System.out.println("Opps someting gone wrong please try again");
		}
		
		sc.close();
	}
}
