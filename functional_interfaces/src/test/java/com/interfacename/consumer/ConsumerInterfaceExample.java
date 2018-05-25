package com.interfacename.consumer;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
			
			Consumer<String> consumerStr1 = s ->{
				System.out.println("Good Morning "+s);
			};
			
			Consumer<String> consumerStr2 = s ->{
				System.out.println(s+" Tell me your full name");
			};
			consumerStr1.andThen(consumerStr2).accept("Shubham");
		
			Consumer<Integer> consumerInt = i ->{
				System.out.println("Integer value : "+i.compareTo(100));
			};
			
			consumerInt.accept(88);
			consumerInt.accept(100);
			
	}
}
