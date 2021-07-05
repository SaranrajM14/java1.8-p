package com.java8features.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
class Movie1{
	public String mname;
	public String mactor;
	@Override
	public int hashCode() {
		return Objects.hash(mactor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie1 other = (Movie1) obj;
		return Objects.equals(mactor, other.mactor) && Objects.equals(mname, other.mname);
	}
	
}

public class Examplesample {
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		set1.add(i1);
		set1.add(i2);
		set1.forEach(System.out::println);
		Movie1 m1=new Movie1();
		Movie1 m2=new Movie1();
		m1.mname="movie2";
		m1.mactor="actor1";
		m2.mname="movie1";
		m2.mactor="actor1";
		Set<Movie1> set2=new HashSet<Movie1>();
		set2.add(m1);
		set2.add(m2);
		set2.forEach(System.out::println);
		
	}

}
