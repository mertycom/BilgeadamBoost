package com.bilgeadam.boost.week7.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Match {
	private static List<Enemy> enemyList = new ArrayList<>();

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		Hero hero = new Hero(1000, 10, 0);
		System.out.println("Hero started journey with "+hero.getHp()+" HP!");
		loadEnemys();
		Collections.sort(enemyList, new SortbyPosition());
		for (Enemy enemy : enemyList) {
			fightAgains(hero, enemy);
		}
		if(hero.getHp()>0) {
			System.out.println("Hero Survived!");
		}
	}

	private static boolean isWin(Hero hero, Enemy enemy) {
		if (hero.getHp() <= 0) {
			System.out.println("Hero defeated at "+enemy.getPosition()+"!");
			return true;
		}
		if (enemy.getHp() <= 0) {
			System.out.println("Hero defeated " + enemy.getEnemyName() + " with " + hero.getHp() + " HP remaining");
			return true;
		}
		return false;
	}

	private static void fightAgains(Hero hero, Enemy enemy) {
		if (hero.getHp() > 0) {
			while (true) {
				hero.setHp(enemy.hit(hero));
				enemy.setHp(hero.hit(enemy));
				if (isWin(hero,enemy)) {
					break;
				}
			}
		}
	}

	private static void loadEnemys() {
		Enemy enemy = new Enemy(300, 7, 1681, EnemyType.ZOMBIE);
		enemyList.add(enemy);
		enemy = new Enemy(300, 7, 3523, EnemyType.ZOMBIE);
		enemyList.add(enemy);
		enemy = new Enemy(50, 2, 276, EnemyType.BUG);
		enemyList.add(enemy);
		enemy = new Enemy(50, 2, 489, EnemyType.BUG);
		enemyList.add(enemy);
		enemy = new Enemy(300, 7, 1527, EnemyType.LION);
		enemyList.add(enemy);
		enemy = new Enemy(300, 7, 2865, EnemyType.LION);
		enemyList.add(enemy);
	}
}
