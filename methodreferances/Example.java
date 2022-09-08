package com.java8features.methodreferances;


@FunctionalInterface

interface ConstructorInterface{
	Hello display(String say);
}

class Hello{
	Hello(String say){
		System.out.println("Good Morning guys ..!\n" + say);
	}
}

public class Example {

	public static void main(String[] args) {

		//Create a collection
		
		
		ConstructorInterface ref = Hello::new;
		
		ref.display("How are you doing ..!");
		
		
		
	}

}
