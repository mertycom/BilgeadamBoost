package com.bilgeadam.boost.week7.day5;

public abstract class Character {
	private int hp;
	private int attack;
	private long position;
	
	public int hit(Character opponent) {
		return opponent.getHp()-this.getAttack();
	}
	
	public Character(int hp, int attack, long position) {
		this.hp = hp;
		this.attack = attack;
		this.position = position;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public long getPosition() {
		return position;
	}
	public void setPosition(long position) {
		this.position = position;
	}
}
