package com.bilgeadam.boost.week7.singleton;

public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {

	}
	/* Thread ikiside aynı anda okuyup farklı obje oluşturmasın diye alttaki gibi yazılır
	 *
	 * public static synchronized LazySingleton getInstance() {
	 */
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	


}
