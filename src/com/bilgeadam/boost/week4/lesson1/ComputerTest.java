package com.bilgeadam.boost.week4.lesson1;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setBrand("Monster");
		computer.setOperatingSystem("Windows");
		computer.setRamSize(32);
		computer.setScrennSize(15.4);
		computer.setSsdCapacity(512);
		
		computer.showFeatures();
		computer.connectWeb();
		
		Computer computer2 = new Computer("Apple",16,512,14,"Mac-os");
		
		computer2.showFeatures();
		computer2.connectWeb();
	}
}
