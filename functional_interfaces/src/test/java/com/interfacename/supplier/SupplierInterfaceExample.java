package com.interfacename.supplier;

import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		
		Supplier<String> supplierStr = () ->{
			return "Hello World!";
		};
		
		System.out.println(supplierStr.get());
		
		Supplier<Integer> supplierInt = () ->{
			return 10;
		};
		
		System.out.println(supplierInt.get());
	}

}
