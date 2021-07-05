package com.java8features.datetimejpa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeJpaExample {
	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println("Local Date :"+d);
		System.out.println(d);
		LocalDate d1=LocalDate.of(2000, Month.JANUARY, 14);
		System.out.println("custome Date "+d1);
		LocalTime time=LocalTime.now();
		System.out.println("system current time"+time);
		LocalTime time2=LocalTime.of(10, 20);
		System.out.println("The Local Time is "+time2);
		
		}


}
