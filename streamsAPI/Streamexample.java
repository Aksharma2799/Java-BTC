package com.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		//Add element to the list
		
		names.add("Ashish");
		names.add("Vishwakarma");
		names.add("BCT");
		names.add("Chennai");

		//i would like to count the number of elements present in the list
		
		int count = 0;
		for(String ele : names) {
			if(ele.length()<=6) 
				count++;
				
			}
				System.out.println("There are : " + count + " Strings with lenght less than 6");
				System.out.println("----------------------------------------------------------");
				
				//let apply stream now! using lambda expression.
				
				int number = (int) names.stream().filter(ele -> ele.length()<6).count();
				System.out.println("there are " +number+" String with length less than 6");	
		
	}

}
