package com.functional.interfaces;

public class GenericFunctionalInterface<T,U,V> {
    public static void main(String[] args) {
 
       /* Sum<Integer,Integer,Integer> addTwoIntegers  = new Sum<Integer, Integer, Integer>() {
            public Integer sum(Integer number1, Integer number2) {
                return  (number1 + number2);
            }
        };
 
        Sum<String,String,String> addTwoStrings  = new Sum<String, String, String>() {
            public String sum(String string1, String string2) {
                return string1.concat(string2);
            }
        };
 
        System.out.println(addTwoIntegers.sum(10,30));
        System.out.println(addTwoStrings.sum("Hello!","World"));*/
 
        Sum<Integer, Integer, Integer> addTwoIntegers = (number1, number2)  -> number1 + number2;
        Sum<String, String, String> addTwoStrings = (string1, string2) -> string1.concat(string2);
        System.out.println(addTwoIntegers.sum(10,30));
        System.out.println(addTwoStrings.sum("Hello! ","World"));
    }
}