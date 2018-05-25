package com.classname.optional;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		//Creating Empty Optional object.
		Optional<String> string1 = Optional.empty();				//Optional.empty() -  Return an empty Optional object.
		if(string1.isPresent())										//isPresent() Method
		{
			System.out.println(string1.get());				//get() Method
		}
		
		Optional<Double> decimal1 = Optional.empty();
		decimal1.ifPresent(System.out::println);		//ifPresent() Method
		
//**********************************************************************************************************************************
		
		//Creating Optional object.
		Optional<String> string2 = Optional.of("Hello World!");				//Optional.of() - Return an Optional object with a non-null value. It will throw NullPointerException if value is null.
		if(string2.isPresent())										//isPresent() Method :-	Optional#isPresent() - Return true if a value is present in the Optional object, otherwise false.
		{
			System.out.println(string2.get());				//get() Method :-	Optional#get() - Return a value from Optional object, if value is present, otherwise throws NoSuchElementException.
		}
		
		Optional<Double> decimal2 = Optional.of(100.00);
		decimal2.ifPresent(System.out::println);		//ifPresent() Method :-	Optional#ifPresent() – This method invoke a Consumer if a value is present in Optional object, otherwise do nothing.
		
//**********************************************************************************************************************************
		
		//Creating Nullable Optional object.
		Optional<String> string3 = Optional.ofNullable(null);				//Optional.ofNullable() - Return an Optional object with a non-null value. It will return empty Optional object if value is null.
		if(string3.isPresent())										//isPresent() Method
		{
			System.out.println(string3.get());				//get() Method
		}
	    
		Optional<Double> decimal3 = Optional.ofNullable(10.9);
		decimal3.ifPresent(System.out::println);		//ifPresent() Method
	
//**********************************************************************************************************************************		
		//orElse(), orElseGet(), orElseThrow() :-
		
		Optional<String> string4 = Optional.empty();
		Optional<String> string5 = Optional.of("Java");
		
		String str1 = string4.orElse("orElse Example");				//orElse() Method :-	Return a value if present, otherwise return other specified value.
		System.out.println(str1);
		
		String str2 = string5.orElse("Optional orElse Example");				////orElse() Method 
		System.out.println(str2);
		
		String str3 = string4.orElseGet(() -> "orElseGet Example");				//orElseGet() Method :-	Return a value if present, otherwise invoke a Supplier that return other value.
		System.out.println(str3);
		
		String str4 = string5.orElseGet(() -> "Optional orElseGet Example");				////orElseGet() Method
		System.out.println(str4);
		
	      try {
	         String str5 = string4.orElseThrow(()->new Exception("Value is not present in Optional"));				//orElseThrow() method :-	Return a value if present, otherwise invoke a Supplier that create and throws an exception.
	         System.out.println(str5);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      try {
	         String str6 = string5.orElseThrow(()->new Exception("Value is not present in Optional"));				//orElseThrow() method
	         System.out.println(str6);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
//**********************************************************************************************************************************
	      //filter(), map(), faltMap() :-
	      
	      Optional<String> optional = Optional.of("Java Optional Example");
	      
	      Optional<String> optional1 = optional.filter(s -> s.contains("Optional"));				//filter() Method
	      optional1.ifPresent(System.out::println);
	      
	      Optional<String> optional2 = optional.map(String::toUpperCase);				//map() Method
	      optional2.ifPresent(System.out::println);
	      
	      Optional<String> optional3 = optional.flatMap(s -> Optional.of(s + " - flatMap() method"));				//flatMap() Method
	      optional3.ifPresent(System.out::println);
	}
	

}
