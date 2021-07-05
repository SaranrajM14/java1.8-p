package com.java8features.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movi{
	public String mname;
	public String mactor;
	public int mreleaseyear;
	@Override
	public String toString() {
		return "Movi [mname=" + mname + ", mactor=" + mactor + ", mreleaseyear=" + mreleaseyear + "]";
	}
	public int getMreleaseyear() {
		return mreleaseyear;
	}
	public void setMreleaseyear(int mreleaseyear) {
		this.mreleaseyear = mreleaseyear;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mactor, mname, mreleaseyear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movi other = (Movi) obj;
		return Objects.equals(mactor, other.mactor) && Objects.equals(mname, other.mname)
				&& mreleaseyear == other.mreleaseyear;
	}
}
public class StreExam {
	public static void main(String[] args) {
		Movi m1=new Movi();
		Movi m2=new Movi();
		Movi m3=new Movi();
		Movi m4=new Movi();
		Movi m5=new Movi();
		m1.mactor="actor1";
		m1.mname="movie1";
		m1.mreleaseyear=2020;
		m2.mactor="actor2";
		m2.mname="movie2";
		m2.mreleaseyear=2020;
		m3.mactor="actor3";
		m3.mname="movie3";
		m3.mreleaseyear=2021;
		m4.mactor="actor3";
		m4.mname="movie3";
		m4.mreleaseyear=2019;
		m5.mactor="actor3";
		m5.mname="movie3";
		m5.mreleaseyear=2019;
		
		
		List<Movi> movieList=new ArrayList<Movi>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
		
		for(Movi mo:movieList) {
			if(mo.mreleaseyear==2020) {
				System.out.println(mo);
			}
		}
		System.out.println("--------------");
		Map<Integer,List<Movi>> lis=movieList.stream().collect(Collectors.groupingBy(Movi::getMreleaseyear));
		
		movieList.stream().filter((a)->a.mactor.equals("actor3")).forEach(System.out::println);
		System.out.println("=====");
		Map<String,List<Movi>> lis1= movieList.stream().collect(Collectors.groupingBy(Movi::getMname));
		lis1.forEach((a,b)->System.out.println("The Key is"+a+"The Value is "+b));
		System.out.println(".........................");
		movieList.stream().distinct().forEach(System.out::println);
		
		
	}

}
