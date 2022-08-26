package com.bilgeadam.boost.praticemyself;

public class deneme2 {
	public static void main(String[] args) {
		int  aylikgiris = 500;
		int toplambakiye =0;
		for (int i = 0; i < 20; i++) {
			aylikgiris = (int) (aylikgiris * 1.2);
			toplambakiye += aylikgiris*12*1.2;
			toplambakiye += toplambakiye*1.25*0.6;
			System.out.println((i)+". yil sonu "+toplambakiye);
		}
		
		
	}
}
