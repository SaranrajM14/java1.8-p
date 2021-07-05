package com.java8features.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String s=null;
		String s1=new String("");
		Optional<String> optional = null;
		if(s!=null) {
			System.out.println("I am From Conditional Statement");
			
		}
		if(optional.isEmpty()) {
			System.out.println("I am From Optional");
		}
	}

}
