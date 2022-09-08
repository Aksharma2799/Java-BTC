package com.java8features;

import java.util.ArrayList;

public class LamdaCollection {

	public static void main(String[] args) {
		
		ArrayList<String> ll =new ArrayList<String>();
		ll.add("Violet");
	
		ll.add("Blue");
		ll.add("Yellow");
		ll.add("Orange");
		ll.add("Red");
		// TODO Auto-generated method stub
		
		ll.forEach( (colors) -> System.out.println(colors));

	}

}
