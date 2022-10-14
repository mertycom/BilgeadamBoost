package com.bilgeadam.boost.week5.lesson1.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamOther {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		
		list.stream().forEach(number -> System.out.print(number+" "));
		
		System.out.println();
		System.out.print("60'tan buyuk sayilar: ");
		list.stream().filter(number -> number>60 )
			.forEach(number -> System.out.print(+number+" "));
		
		System.out.println();
		
		//distinct (özgün değerler) her sayıdan bir tanesini yazdır.
		System.out.print("Ozgun degerler: ");
		list.stream().distinct().forEach(number -> System.out.print(number+" "));
		
		System.out.println();
		//sorted (sıralı)
		System.out.print("Sirali sekilde: ");
		list.stream().sorted().forEach(number -> System.out.print(number+" "));
		
		//tersten diz
		System.out.println();
		System.out.print("Tersten Sirali: ");
		list.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.print(number+" "));
		
		System.out.println();
		
		//limit
		System.out.print("Listenin ilk 5 elemani: ");
		list.stream().limit(5).forEach(number -> System.out.print(number+" "));
		
		System.out.println();
		
		//skip atla
		System.out.print("Listenin ilk elemanini atla: ");
		list.stream().skip(1).forEach(number -> System.out.print(number+" "));
		
		System.out.println();
		//count
		long count = list.stream().count();
		System.out.print("Listenin eleman sayisi: ");
		System.out.println( count );
		
		System.out.println();
		
		//anymacht koşul sağlanıyormu
		boolean a = list.stream().anyMatch(number -> number<2);
		System.out.println(a);
		
		//allMatch koşulu tum elemanlar sağlıyorsa
		a=list.stream().allMatch(number -> number>0);
		System.out.println(a);
		
		//noneMatch
		a=list.stream().noneMatch(number -> number>100);
		System.out.println(a);
		
		list.stream().close();
		
		


		
	}
}
