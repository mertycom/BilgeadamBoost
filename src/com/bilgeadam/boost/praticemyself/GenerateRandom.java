package com.bilgeadam.boost.praticemyself;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandom {
	public static void main(String[] args) {
		Random random = new Random();
		int upperBound=20;
		int lowerBound=15;
		
		int intRandom = random.nextInt(upperBound);
		double doubleRandom = random.nextDouble();
		float floatRandom = random.nextFloat();
		System.out.println("Random integer from 0 to upperbound : "+intRandom);
		System.out.println("Random double generates a double between 0.0 and 1.0. : "+ doubleRandom);
		System.out.println("Random float generates a float between 0.0 and 1.0. : " + floatRandom);
		
		intRandom = (int)Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound);
		System.out.println("Random integer from lowerBound to upperbound : "+intRandom);
		
		intRandom = ThreadLocalRandom.current().nextInt();
		System.out.println("Random integer : "+intRandom);
	}
}
