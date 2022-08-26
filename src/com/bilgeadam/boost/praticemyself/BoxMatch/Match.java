package com.bilgeadam.boost.praticemyself.BoxMatch;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	public void run() {
		int round = 0;
		if (isCheck()) {
			while (true) {
				round++;
				System.out.println("\n======= Round "+ round +" =======\n");
				if (first() == 1) {
					this.f2.health = this.f1.hit(f2);
					System.out.println(this.f2.name + " health " + this.f2.health);
					if (isWin()) {
						break;
					}

					this.f1.health = this.f2.hit(f1);
					System.out.println(this.f1.name + " health " + this.f1.health);
					if (isWin()) {
						break;
					}
				} else {
					this.f1.health = this.f2.hit(f1);
					System.out.println(this.f1.name + " health " + this.f1.health);
					if (isWin()) {
						break;
					}

					this.f2.health = this.f1.hit(f2);
					System.out.println(this.f2.name + " health " + this.f2.health);
					if (isWin()) {
						break;
					}
				}
			}

		} else {
			System.out.println("Sporcularin sikletleri uyusmuyor.");
		}
	}

	boolean isCheck() {
		return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));

	}

	boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println("\n=======>   " + this.f2.name + " kazandi!   <=======");
			return true;
		}
		if (this.f2.health == 0) {
			System.out.println("\n=======>   " + this.f1.name + " kazandi!   <=======");
			return true;
		}
		return false;
	}

	int first() {
		double firstOne = Math.random() * 100;
		if (firstOne < 50) {
			return 1;
		} else {
			return 0;
		}
	}
}
