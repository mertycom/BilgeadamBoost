package com.bilgeadam.boost.week7.day5;

public class Enemy extends Character {
	public EnemyType enemyType;

	public Enemy(int hp, int attack, long position, EnemyType enemyType) {
		super(hp, attack, position);
		this.enemyType = enemyType;
	}

	public EnemyType getEnemyType() {
		return enemyType;
	}
	
	public String getEnemyName() {
		if(this.getEnemyType()==EnemyType.BUG)
			return "Bug";
		if(this.getEnemyType()==EnemyType.LION)
			return "Lion";
		if(this.getEnemyType()==EnemyType.ZOMBIE)
			return "Zombie";
		return "";
	}

	@Override
	public int hit(Character opponent) {	
		return opponent.getHp()-super.getAttack();
	}


}
