package com.bilgeadam.boost.week2.lesson5;

import java.util.Scanner;

public class EbobEkok {
	public static void main(String[] args) {
		
      int n1, n2,ebob=1, ekok;
      Scanner sc = new Scanner(System.in);
      System.out.print("First number: ");
      n1 = sc.nextInt();
      System.out.print("Second number: ");
      n2 = sc.nextInt();

      for(int i = 1; i <= n1 && i <= n2; ++i)
       {
           if(n1 % i == 0 && n2 % i == 0)
               ebob = i;
       }

       ekok = (n1 * n2) / ebob;
       System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
       System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok); 
       sc.close();
   }
}
