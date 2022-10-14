package com.bilgeadam.boost.week4.lesson4;

public class Arrays {
	public static void main(String[] args) {
		
		int[] test = {2,-9,0,5,12,-25,22,9,8,12};
		
		int sum = 0;
		
	//	for (int i=0 ; i<test.length;i++) {
	//	sum += test[i];
	//	}
		
		for (int i : test) {
			sum += i;
		}
		
		double average = sum / test.length; 
		
		System.out.println(sum);
		System.out.println(average);
	}
	
	public static void printPermutation(int[] nums, int index, int[] print_arr) {
	    if (index == nums.length) {
	        System.out.println(java.util.Arrays.toString(print_arr));
	    }
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] > 0) {
	            print_arr[index] = nums[i];
	            nums[i] = -1;
	            printPermutation(nums, index + 1, print_arr);
	        }
	    }
	}
}
