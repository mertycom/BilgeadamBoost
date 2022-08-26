package com.bilgeadam.boost.week2.lesson5;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		int pass,inputPass,maxInput=3;
		Scanner sc = new Scanner(System.in);
		boolean success = false;
		pass=1234;
	    
	    do{
		    System.out.print("Login Password : ");
		    inputPass = sc.nextInt();
		    if(inputPass==pass) {
		    	success=true;
		    	break;
		    }
		    maxInput--;
	    }while(maxInput>0);
		
	    if(success) {
	    	welcome();
	    }else {
	    	System.out.println("Wrong entry three times!!!");
	    }
	    sc.close();
	}
	static void welcome() {
		System.out.println("Welcome");
	}
}
