package com.java8features.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*Functional Interface are
 * Predicate-->returntype(boolean)--->methodname(test())
 * Function-->returntype(UserReturnType)--->methodname(apply())
 * Consumer-->returntype(void)--->methodname(accept())
 * Supplier-->returntype(UserReturnType)--->methodname(get())//no argument for supplier
 * */
public class FunctionaInterfaceExample {

	public static void main(String[] args) {
		//predicate
		Predicate<Integer> p=(i)->i%2==0;
		System.out.println("predicate function interface example for even or odd :"+p.test(5));
		//function
		Function<Integer, Integer> f=(j)->j*j;
		System.out.println("Functional Interface for Square of Two Number :"+f.apply(5));
		//consumer
		Consumer<String> c=(k)->{System.out.println("I am From Cosumer"+k);};
		System.out.println("Cosumer Example :");
		c.accept("Java1.8");
		//Supplier
		Supplier<Integer> s=()-> {return 5;};
		System.out.println("Supplier :"+s.get());
	}

}
