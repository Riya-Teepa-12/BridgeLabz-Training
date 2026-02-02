package com.streams.trendingmovies;

import java.util.*;
import java.util.stream.*;

public class TopTrendingMovies {
	 public static void main(String[] args) {
	        List<Movie> movies=new ArrayList<>();
	        movies.add(new Movie("Inception",8.8,2010));
	        movies.add(new Movie("Interstellar",8.6,2014));
	        movies.add(new Movie("Oppenheimer",8.9,2023));
	        movies.add(new Movie("Avatar",7.8,2009));
	        movies.add(new Movie("The Dark Knight",9.0,2008));
	        movies.add(new Movie("Dune Part 2",8.7,2024));
	        movies.add(new Movie("Tenet",7.5,2020));
	        movies.add(new Movie("Joker",8.5,2019));

	        movies.stream().filter(movie->movie.getRating()>=8).sorted((m1,m2)->{
	                  if(Double.compare(m2.getRating(),m1.getRating())==0){
	                      return Integer.compare(m2.getReleaseYear(),m1.getReleaseYear());
	                  }
	                  return Double.compare(m2.getRating(),m1.getRating());
	              }).limit(5).forEach(System.out::println);
	    }
}
