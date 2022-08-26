package com.bilgeadam.boost.praticemyself;

public class deneme {
	public static void main(String[] args) {

		int aylikgiris = 3000;
		int i, j, x = 0;
		int toplambakiye = 50000, kazanc, toplamyillikyatirim = 0,toplamyatirim=0;
		double yillikyuzde=1;
		for (j = 0; j < 5; j++) {
			for (i = 0; i < 12; i++) {
				kazanc = (int) ((toplambakiye) * 1.08);
				toplambakiye = kazanc + aylikgiris;
				yillikyuzde = (yillikyuzde * 1.08);
			}
			
			toplamyillikyatirim = aylikgiris * 12;
			toplamyatirim += toplamyillikyatirim;
			aylikgiris = (int) (aylikgiris * 1.20);
			System.out.println("Yuzde "+yillikyuzde);
			System.out.println(j + 1 + ".yil bakiye \t \t" + toplambakiye);
			System.out.println(j + 1 + ".yil aylik giris \t" + aylikgiris);
			System.out.println(j + 1 + ".yil toplam yatirim \t" + toplamyatirim);
		}
		for (i = 0; i < 10; i++) {
			toplambakiye = (int) (toplambakiye * 1.2);
		}
		System.out.println("15 yil sonra \t \t" + toplambakiye);
		x = 600000;
		int y = 5500;
		for (i = 0; i < 5; i++) {
			x = (int) (x * 1.2);
			y = (int) (y * 1.2);
			System.out.println("faizdeki paranın " + x);
			System.out.println("asgari ücret " + y);
		}

	}

}
