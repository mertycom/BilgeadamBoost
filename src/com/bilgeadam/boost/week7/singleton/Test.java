package com.bilgeadam.boost.week7.singleton;

public class Test {
	public static void main(String[] args) {

		LazySingleton s1 = LazySingleton.getInstance();
		LazySingleton s2 = LazySingleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);

	}
}
