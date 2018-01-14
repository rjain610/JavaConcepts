package com.rahul.javaconcepts.Abstract;

public abstract class Beverage {
	
	public Beverage() {
		//Constructor will always get initialized first 
		System.out.println("Starting Beverage machine");
	}
		
	 void prepareBase() {
		System.out.println("Boiling milk and water");
	}
	
	public abstract String prepareBeverage();
	
	void stop() {
		System.out.println("Shutting down..");
	}
	
}
