package com.java8features.functional.interfaces;

import java.util.function.IntBinaryOperator;

import com.java8features.methodreferances.Example;

interface myinterface{
	
}



//Creating our own functuinal interface
interface MyFunctionalInterface{
	
	//single abstract method
	public int addMethod(int a, int b);
	
}

public class Functionalinterface {
	


	public static void main(String[] args) {

		//Lambda operation
		MyFunctionalInterface sum = (a,b) -> a+b;
		System.out.println("Result + " + sum.addMethod(12,100));
	
		//Predefined functional interface
		//lambda expression
		
		IntBinaryOperator add = (a,b) -> a+b;
		System.out.println("Result :" + add.applyAsInt(100, 12));
		
		
		//Creating an object to the class example
		Example instan = new Example();
		//calling the default method
		
	}

}
