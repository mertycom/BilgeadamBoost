package com.bilgeadam.boost.week2.lesson2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int x = 2;
		float y = 7f;
		
		double sum;
		double sub, multi, mod, div;
		
		sum = x+y;
		sub = x-y;
		multi = x*y;
		mod = x%y;
		div =x/y;
		
		System.out.println("Sum: "+sum);
		System.out.println("Sub: "+sub);
		System.out.println("Multi: "+multi);
		System.out.println("Mod: "+mod);
		System.out.println("Div: "+div);
		
		System.out.println("\n"+"Sum: "+sum+"\n"+"Sub: "+sub+"\n"+"Multi: "+multi+"\n"+"Mod: "+mod+"\n"+"Div: "+div);
		
		System.out.println(x++);
		System.out.println(++x);
		
	}

}
