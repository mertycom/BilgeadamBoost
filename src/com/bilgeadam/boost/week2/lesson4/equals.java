package com.bilgeadam.boost.week2.lesson4;

public class equals {

	public static void main(String[] args)
	    {
	        String s1 = new String("ABC");
	        String s2 = new String("ABC");
	 
	        System.out.println(s1==s2);           // false
	        System.out.println(s1.equals(s2));    // true
	        
	        String s3 = "ABC";
	        String s4 = "ABC";
	 
	        System.out.println(s3==s4);         // true
	        System.out.println(s3.equals(s4));  // true
	    }
	}