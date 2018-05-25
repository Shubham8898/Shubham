package com.interfacename.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterfaceExample {

	public static void main(String[] args) {
		
		BiFunction<String,String,String> functionStr = (s1,s2) -> {
				String s3 = s1+s2;
				return s3;
		};

		System.out.println(functionStr.apply("Core"+" ", "Java"));
	
		BiFunction<Integer,Integer,Integer> functionInt1 = (i1,i2) -> i1+i2;
		
			//System.out.println(functionInt1.apply(10,20));
		
		Function<Integer,Integer> functionInt2 = (i) -> i*i;
		
		System.out.println(functionInt1.andThen(functionInt2).apply(10, 20));
		System.out.println(functionInt1.andThen(functionInt2).apply(-10, 2));
	}

}
