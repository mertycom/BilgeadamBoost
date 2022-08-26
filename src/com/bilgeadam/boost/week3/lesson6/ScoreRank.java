package com.bilgeadam.boost.week3.lesson6;

import java.util.Scanner;

public class ScoreRank {
	public static void main(String[] args) {
		double scScore = scScore();
		System.out.println(scoreRank(scScore));
	}

	private static String scoreRank(double score) {
		if (score >= 200.5)
			return "Your Rank is A";
		else if (score >= 122.4)
			return "Your Rank is B";
		else
			return "Your Rank is C";
	}

	private static double scScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Puan girin: ");
		double number = sc.nextDouble();
		sc.close();
		return number;
	}
}