package com.bilgeadam.boost.week5.lesson4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		long date = System.currentTimeMillis();
		Date today = new Date(date);
		
		//System.out.println(date2);
		//System.out.println(today);
		
		DateFormat dataformat = new SimpleDateFormat("dd/MM/YY");
		System.out.println(dataformat.format(today));
		
		LocalDate twentySevenFeb2017Date = LocalDate.of(2017, 2, 27);
		System.out.println(twentySevenFeb2017Date);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        LocalDate asd = LocalDate.parse("22.12.2022", formatter);
        System.out.println(asd.format(formatter));
	}
}
