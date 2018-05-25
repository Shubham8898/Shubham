package com.interfacename.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterListExample {

	public static void main(String[] args) {
		
		List<String> days = Arrays.asList(new String[] {"Monday", "Tuesday", "Wednesday", 
																						"Thursday", "Friday", "Saturday", "Sunday"});
		// Filter list using old method
		List<String> filteredDays1 = getFilteredDays(days, "T");
		System.out.println(filteredDays1);
		
		// Filter list using stream filter() method
		List<String> filteredDays2 = getStreamFiltereddays(days, "S");
		System.out.println(filteredDays2);
		
	}

	private static List<String> getStreamFiltereddays(List<String> days, String str) {
		List<String> list = new ArrayList<>();
		for(String day : days)
		{
			if(day.startsWith(str)) 
			{
				list.add(day);
			}
		}
		return list;
	}

	private static List<String> getFilteredDays(List<String> days, String str) {
		
		Stream<String> stream = days.stream();
		
		List<String> list = days.stream()
				.filter((day) ->{
					return day.startsWith(str);
				}).collect(Collectors.toList());
		
		return list;
	}

}
