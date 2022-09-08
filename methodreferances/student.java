package com.java8features.methodreferances;

import java.util.function.BiFunction;

@FunctionalInterface

interface MyInterface{
	// A method -- abstract method
	public void display();
}

class addition{
	
	static int add(int fnumber, int snumber) {
		return (fnumber + snumber);
	}
}

public class student {
	/*
	 * Method refereces is the short hand notation of lambda expression to call a method.
	 * 
	 * str - System.out.println(Str)
	 * System.out::println 
	 */
	
	
	public void myMethod() {
		System.out.println("Instance Method");
	}
	

	public static void main(String[] args) { 
		//Create an object to class - student
		student object = new student();
		
		//Method reference usign the  object of the class
		
		MyInterface ref = object::myMethod;
		//calling the method of functional interface
		ref.display();
		
		//Create an object to class addition
		
		BiFunction<Integer,Integer,Integer> Addition = addition::add; 
		int sum = Addition.apply(11, 4);
		System.out.println("Addition : "+sum);
	}

}
