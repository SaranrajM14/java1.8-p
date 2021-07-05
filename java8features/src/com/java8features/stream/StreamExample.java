package com.java8features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/**/
class Movie{
	public String movieName;
	public int realseYear;
	public String actorName;
	public Movie(String movieName, int realseYear, String actorName) {
		this.movieName = movieName;
		this.realseYear = realseYear;
		this.actorName = actorName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(actorName, movieName, realseYear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(actorName, other.actorName) && Objects.equals(movieName, other.movieName)
				&& realseYear == other.realseYear;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", realseYear=" + realseYear + ", actorName=" + actorName + "]";
	}
	
}
public class StreamExample {

	public static void main(String[] args) {
		Movie m1=new Movie("movie1",2020,"actor1");
		Movie m2=new Movie("movie2",2021,"actor2");
		Movie m3=new Movie("movie3",2019,"actor3");
		Movie m4=new Movie("movie3",2019,"actor3");
		List<Movie> movieList=new ArrayList<Movie>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		//filter->only return true or false
		System.out.println("Filter true statement only retutn");
		movieList.stream().filter(a->a.realseYear==2021).forEach(System.out::println);
		//map->It is a Function
		System.out.println("Function are  process the value");
		movieList.stream().map(a->a.realseYear+1).forEach(System.out::println);
		movieList.forEach(System.out::println);
		//distinct()
		System.out.println("It allow only unique value");
		List<Movie> lis=movieList.stream().distinct().collect(Collectors.toList());
		lis.forEach(System.out::println);
		//count()
		System.out.println("It count the value");
		long a=movieList.stream().count();
		System.out.println("The of an List is : "+a);
				
		List<Integer> listOfArray= new ArrayList<>(Arrays.asList(1,5,8,3,6));
		listOfArray.stream().sorted((d,b)->b.compareTo(d)).forEach(System.out::println);
		
	}

}
