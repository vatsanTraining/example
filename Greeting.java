package com.training;

public class Greeting {

	public String getMessage() {
		
		return "Welcome to Java Programming";
	}


	public String getMessage(String name) {
		
		return name + " Welcome to Java Programming";
	}
	
	public String showAllMessages(String ...names) {
		
		for(String name : names) {
			
			System.out.println(name);
		}
	}
}
