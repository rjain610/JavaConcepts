package com.rahul.javaconcepts.Factory;

public class BeverageFactory {
	

//hiding of constructor so that object of factory cannot be created by other classes
	private BeverageFactory(){
		
	}
	
	/** returns an object of Beverage by creating instance at runtime using reflection
	 * thus hiding implementation logic from the client
	 */
	public static Beverage getBeverageInstance(String bevName) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return  (Beverage) Class.forName(bevName).newInstance();
	}
}
