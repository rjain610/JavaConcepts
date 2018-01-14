package com.rahul.javaconcepts.Factory;

import java.util.Scanner;

public class MainFactory {

	public static void main(String[] args) {
		
		System.out.println("Enter your beverage");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		String beverageName = reader.nextLine(); 
		reader.close();
		
		//beverageName = "com.rahul.javaobject.Factory."+beverageName;
		try {
			
			Beverage b = BeverageFactory.getBeverageInstance(beverageName);
			System.out.println(b.prepareBeverage());
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
