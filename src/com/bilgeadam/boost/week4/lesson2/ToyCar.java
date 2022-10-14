package com.bilgeadam.boost.week4.lesson2;

public class ToyCar {

	private int batteryCapacity;
	private int distanceX;
	private int distanceY;

	public ToyCar(int batteryCapacity, int distanceX, int distanceY) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.distanceX = distanceX;
		this.distanceY = distanceY;
	}

	public void remainigBattery() {
		System.out.println("Remaining Battery: " + this.batteryCapacity);
	}

	public void charge() {
		this.batteryCapacity = 10;
	}

	public void moveOneXForward() {
		this.distanceX ++;
		this.batteryCapacity --;
	}

	public void moveOneYForward() {
		this.distanceY ++;
		this.batteryCapacity --;
	}

	public void moveOneXBackward() {
		this.distanceX --;
		this.batteryCapacity --;
	}

	public void moveOneYBackward() {
		this.distanceY --;
		this.batteryCapacity --;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDistanceX() {
		return distanceX;
	}

	public void setDistanceX(int distanceX) {
		this.distanceX = distanceX;
	}

	public int getDistanceY() {
		return distanceY;
	}

	public void setDistanceY(int distanceY) {
		this.distanceY = distanceY;
	}

	@Override
	public String toString() {
		return "ToyCar [batteryCapacity=" + batteryCapacity + ", distanceX=" + distanceX + ", distanceY=" + distanceY
				+ "]";
	}
}
