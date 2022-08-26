package com.bilgeadam.boost.week3.lesson6;

import java.util.Scanner;

public class Atm {
	final private static String userName = "user";
	final private static String userPassword = "123";
	final private static int maxWrongEntry = 3;
	private static int balance = 1500;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\nWelcome the most famous bank...");
		System.out.println("Please enter your user name and password.");
		showUserAndPasswordPage();
		do {
			showMenu();
			System.out.print("Choice: ");
			String operation = getString();
			doOperation(operation);
		} while (true);
	}

	private static void showUserAndPasswordPage() {
		for (int i = 1; i <= maxWrongEntry; i++) {
			String user = getUserName();
			String password = getPassword();
			if ( !user.equalsIgnoreCase(userName) || !password.equals(userPassword)) {
				System.out.println("Wrong user name or password!! Try Again");
				System.out.println("Your remaining entry is " + (3 - i));
			} else
				return;
		}
		System.out.println("Account is Bloked");
		System.out.println("Bye...");
		System.exit(0);

	}

	private static void doOperation(String operation) {
		switch (operation) {
		case "1":
			depositMoney();
			break;
		case "2":
			withdrawMoney();
			break;
		case "3":
			showBalance();
			break;
		case "4":
			System.out.println("Bye...");
			Atm.main(null);
			//System.exit(0); 
		default:
			System.out.println("Wrong input!! Try Again.");
			break;
		}
	}

	private static void showBalance() {
		System.out.println("Your balance is " + balance);
	}

	private static void withdrawMoney() {
		if (balance <= 0) {
			System.out.println("Not enough balance!! Returning menu");
			return;
		}
		System.out.println("Your balance is " + balance);
		System.out.print("Money will you withdraw: ");
		int input = sc.nextInt();
		if (balance < input) {
			System.out.println("Not enough balance!! Try again");
			withdrawMoney();
		} else {
			balance -= input;
			System.out.println("New Balance: " + balance);
		}
	}

	private static void depositMoney() {
		System.out.print("Money will you deposit: ");
		int input = sc.nextInt();
		balance += input;
		System.out.println("New Balance: " + balance);
		return;
	}

	private static void showMenu() {
		System.out.println();
		System.out.println("1- Deposit");
		System.out.println("2- Withdraw");
		System.out.println("3- Balance");
		System.out.println("4- Exit");
	}
	
	private static String getString() {
		String input = sc.next();
		return input;
	}

	private static String getPassword() {
		System.out.print("Password: ");
		String password = sc.next();
		return password;

	}

	private static String getUserName() {
		System.out.print("\nUser name: ");
		String user = sc.next();
		return user;
	}

}
