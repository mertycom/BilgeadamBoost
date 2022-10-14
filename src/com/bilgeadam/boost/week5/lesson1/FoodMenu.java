package com.bilgeadam.boost.week5.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FoodMenu {
	
	
	public static void main(String[] args) {
		
		String [] days = days();
		for (String day : days) {
			System.out.println(day +" -> "+mainCourses()+" - "+snack());
		}
		
		
		
	}
	public static int randomPick (int number) {
		Random random = new Random();
		return random.nextInt(number);
	}
	
	public static String[] days(){
		String[] days = new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		return days;
		
	}
	
	public static String mainCourses() {
		List<String> mainCourses = new ArrayList<>();
		mainCourses.add("Spaghetti Bolognese");
		mainCourses.add("Cottage pie");
		mainCourses.add("Macaroni Cheese");
		mainCourses.add("Beef Stew");
		mainCourses.add("Lasagne");
		mainCourses.add("Beef Stroganoff");
		mainCourses.add("Roast Chicken");
		
		return mainCourses.get(randomPick(mainCourses.size()));
		
	}
	
	public static String snack() {
		List<String> snack = new ArrayList<>();
		snack.add("roast potatoes");
		snack.add("corn on the cob");
		snack.add("noodle cabbage salad");
		snack.add("Rainbow slaw ");
		
		
		return snack.get(randomPick(snack.size()));
		
	}
}
