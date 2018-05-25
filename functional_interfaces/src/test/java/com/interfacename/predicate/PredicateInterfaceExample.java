package com.interfacename.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		
		Predicate<Integer> predicateInt = i ->
		{
			return i>0;
		};
		System.out.println(predicateInt.test(10));
		System.out.println(predicateInt.test(-10));

		Predicate<String> predicateString = s ->
		{
			return s.contains("s");
		};
		//System.out.println(predicateString.test("Tests"));
		//System.out.println(predicateString.test("ant"));
		
		//AND Logical Operation
		Predicate<String> predicateAnd = predicateString.and(s -> s.length()<4);
		System.out.println(predicateAnd.test("Hello guys"));
		
		//OR Logical Operation
		Predicate<String> predicateOr = predicateString.or(s -> s.length()==9);
		System.out.println(predicateOr.test("Hello guy"));
		
		//Negate Logical Operation
		Predicate<String> predicateNegate=predicateString.negate();
		System.out.println(predicateNegate.test("Apples"));
		
	}
}
