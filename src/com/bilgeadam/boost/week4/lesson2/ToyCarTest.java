package com.bilgeadam.boost.week4.lesson2;

import java.util.Scanner;

public class ToyCarTest {
	public static void main(String[] args) {
		ToyCar toyCar = new ToyCar(5, 0, 0);
		Scanner sc = new Scanner(System.in);
		System.out.println(toyCar);
		do {
			System.out.print("Move with wasd and charge e: ");
			char operator = sc.next().charAt(0);
			startPlay(operator, toyCar);
			System.out.println(toyCar);
		} while (toyCar.getBatteryCapacity() != 0);
		System.out.println("Battary Finish...");
		sc.close();
	}

	private static void startPlay(char operator, ToyCar toyCar) {

		switch (operator) {
		case 'w':
			toyCar.moveOneYForward();
			break;
		case 'a':
			toyCar.moveOneXBackward();
			break;
		case 's':
			toyCar.moveOneYBackward();
			break;
		case 'd':
			toyCar.moveOneXForward();
			break;
		case 'e':
			toyCar.charge();
			break;
		default:
			System.out.println("Invalid operator!");
		}
	}
}
