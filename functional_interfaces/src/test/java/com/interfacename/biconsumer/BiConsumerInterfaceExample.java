package com.interfacename.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

	public static void main(String[] args) {
		
		BiConsumer<Integer, String> consumer = (a,b) ->{
			System.out.println(a+b);
		};
		
		consumer.accept(1, ". Shubham");

		BiConsumer<Integer, Integer> addition = (a,b) ->{
			System.out.println(a+b);
		};
		
		BiConsumer<Integer, Integer> subtraction = (a,b) ->{
			System.out.println(a-b);
			//System.out.println(a*b);
		};
		
		addition.andThen(subtraction).accept(10, 20);
		subtraction.andThen(addition).accept(20, 10);
	}

}
