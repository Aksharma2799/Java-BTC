package com.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {

		
		List<Integer> number = new ArrayList<Integer>();
		number.add(25);
		number.add(17);
		number.add(19);
		number.add(171);
	
		System.out.println(number);
		System.out.println("Even Number : ");
		number.stream().filter(evn -> evn % 2 == 0).forEach(System.out::println);
		
		System.out.println("Odd Number : ");
		number.stream().filter(evn -> evn % 2 > 0).forEach(System.out::println);
			
		
	}

}
