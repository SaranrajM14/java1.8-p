package com.java8features.functionalinterface;

import java.util.function.Predicate;

public class FunExa {
	public static void main(String[] args) {
		Predicate<String> obj1=(str)->str.length()>5;
		Predicate<String> obj2=(str)->str.length()%2==0;
		
		Predicate<String> obj3=obj1.or(obj2);
		System.out.println("The length is > 5 :"+obj3.test("posdffg") );
	}

}
