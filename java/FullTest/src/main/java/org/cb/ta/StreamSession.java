package org.cb.ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSession {
	public static void main(String[] args) {
		String [] namesArray = {"Zig-Zag Traversal", "Nikola Tesla", "Spiderman"
                , "Superman", "Edison", "Newton", "Timmy", "Archimed", "Einstein"};
		List<String> names = new ArrayList<>(Arrays.asList(namesArray));

        Integer [] numbersArray = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(numbersArray));
        
        
        //find even numbers using for loop
        for(int i = 0; i < numbers.size(); i++) {
        	Integer integer = numbers.get(i);
        	if(integer % 2 == 0) {
        		System.out.print(integer);
        	}
        }
        
        //find even numbers using stream API
        Predicate<Integer> predicate = (Integer number) -> { return number % 2 == 0; }; 
        List<Integer> evens = numbers.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(evens);
        
        //find even numbers using stream API
        evens = numbers.stream().
        		filter( (Integer number) -> ( number %2 ==0) ).
        		collect(Collectors.toList());
        System.out.println(evens);
        System.out.println(numbers);
        
        
        
        //double array with for loop
        //double array using stream API - map
        //print itself and after collect
        
        //of
        Stream.of(numbersArray).
        	filter( (Integer number) -> ( number %2 ==0) ).
        	collect(Collectors.toList());
        
        //count
        Stream.of(numbersArray).count();
        
        //sort
        Stream.of(numbersArray).
        	sorted().
        	collect(Collectors.toList());
        
        //sort comparator interface usage
        Comparator<Integer> compareObj = (number1, number2) -> { 
        	return -1 * number1.compareTo(number2); 
        };
        
        Stream.of(numbersArray).
        	sorted(compareObj).
        	collect(Collectors.toList());
        
        //sort with lambda
        Stream.of(numbersArray).
    		sorted((number1, number2) -> { return -1 * number1.compareTo(number2); }).
    		collect(Collectors.toList());
        
        //foreach with functional interface
        Consumer<Integer> ci = (number) -> { System.out.println(number);};
        Stream.of(numbersArray).forEach(ci);
        
        //lambda
        Stream.of(numbersArray).forEach((number) -> { 
        	int numSquare = number * number;
        	System.out.println(numSquare);});
	}

}
