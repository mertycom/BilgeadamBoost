package com.bilgeadam.boost.praticemyself;

import java.util.List;

public class Best_Practice {
	public static void main(String[] args) {
		String a ="45385593107843568";
		System.out.println(fakeBin(a));
		reverse(5);
	}

	private static String creverseString(String string) {

		return new String(new StringBuffer(string).reverse());
	}

	public static String noSpace(final String x) {
		return x.replace(" ", "");
	}
	
    public static String fakeBin(String numberString) {
    	String output="";
        for(int i=0;i<numberString.length();i++){
          if(numberString.charAt(i)- '0'<5) {
        	  output += 0;
          }else {
        	  output += 1;
          }
        }
      return output;
    }
    
    public static String areYouPlayingBanjo(String name) {
        if(name.charAt(0) == 'r' || name.charAt(0) == 'R'){
        	return name + " plays banjo";
        }else {
        	return name + " does not play banjo";
        }
      }
    
    public static void reverse(int n){
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
          answer[i] = n-i;
        }
        for (int i : answer) {
			System.out.println(i);
		}
        
      }

}
