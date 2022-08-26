package com.bilgeadam.boost.week3.lesson7;

import java.util.Scanner;

public class Heartstone {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String player1Hero, player2Hero, player1Warrior, player2Warrior;
		do {
			System.out.println("\nWelcome game");
			System.out.println("............\n");

			showHeros();
			System.out.print("\nChoise hero for Player-1: ");
			player1Hero = getHero();
			showWarriors();
			System.out.print("\nChoise warrior for Player-1: ");
			player1Warrior = getWarrior();
			showHeros();
			System.out.print("\nChoise hero for Player-2: ");
			player2Hero = getHero();
			showWarriors();
			System.out.print("\nChoise warrior for Player-2: ");
			player2Warrior = getWarrior();

			System.out.print("\nPlayer-1 Hero: " + player1Hero + "\tvs.\tPlayer-2 Hero: " + player2Hero);
			System.out.println("\nPlayer-1 Warrior: " + player1Warrior + "\tvs.\tPlayer-2 Warrior: " + player2Warrior);

		} while (askDoItAgain());
	}

	private static void showWarriors() {
		System.out.println("1-Alexstraza\n2-Ysera\n3-DrBoom\n4-Onyxia\n5-Anomaius\n6-King\n7-Crush");

	}

	private static void showHeros() {
		System.out.println("1-Mage\n2-Warlock\n3-Hunter");
	}

	private static String getWarrior() {
		int input = sc.nextInt();
		String warriorName = null;
		switch (input) {
		case 1:
			warriorName = "Alexstraza";
			break;
		case 2:
			warriorName = "Ysera";
			break;
		case 3:
			warriorName = "DrBoom";
			break;
		case 4:
			warriorName = "Onyxia";
			break;
		case 5:
			warriorName = "Anomaius";
			break;
		case 6:
			warriorName = "King";
			break;
		case 7:
			warriorName = "Crush";
			break;
		default:
			System.out.print("Wrong input pls try Again: ");
			getWarrior();
		}
		return warriorName;

	}

	private static String getHero() {
		String heroName = null;
		int input = sc.nextInt();
		switch (input) {
		case 1:
			heroName = "Mage";
			break;
		case 2:
			heroName = "Warlock";
			break;
		case 3:
			heroName = "Hunter";
			break;
		default:
			System.out.println("Wrong input pls try Again");
			getHero();
		}
		return heroName;
	}

	private static boolean askDoItAgain() {
		System.out.println("\nWanna play again ? Y/N: ");
		String str = sc.next();
		if (str.equalsIgnoreCase("Y"))
			return true;
		return false;
	}

}
