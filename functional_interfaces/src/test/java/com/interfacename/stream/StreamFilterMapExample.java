package com.interfacename.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterMapExample {

	public static void main(String[] args) {
		
		Map<Integer , String> days = new HashMap<>();
		days.put(1 ,  "Monday");
		days.put(2 ,  "Tuesday");
		days.put(3 ,  "Wednesday");
		days.put(4 ,  "Thursday");
		days.put(5 ,  "Friday");
		days.put(6 ,  "Saturnday");
		days.put(7 ,  "Sunday");
		
		Map<Integer , String> result1 = getFilteredDays(days, "T");
		System.out.println(result1);
		
		Map<Integer , String> result2 = getStreamFilteredDays(days , "S");
		System.out.println(result2);
		
	}

	private static Map<Integer, String> getStreamFilteredDays(Map<Integer, String> days, String str) {
		
		Map<Integer , String> result = new HashMap<>();
		for(  Entry<Integer , String> day : days.entrySet())
		{
			if(day.getValue().startsWith(str))
			{
				result.put(day.getKey() , day.getValue());
			}
		}
		return result;
	}

	private static Map<Integer, String> getFilteredDays(Map<Integer, String> days, String str) {
		
		Stream<   Entry<Integer, String>  > stream = days.entrySet().stream();
		
	    Map<Integer, String> result = stream
	    				.filter((e) -> 
	    				{
	    						return e.getValue().startsWith(str);
	    				})
	    				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

	    return result;
	}

}
