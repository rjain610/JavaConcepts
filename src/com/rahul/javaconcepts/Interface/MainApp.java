package com.rahul.javaconcepts.Interface;

import com.rahul.javaconcepts.Factory.Beverage;
import com.rahul.javaconcepts.Factory.Coffee;
import com.rahul.javaconcepts.Factory.Tea;

public class MainApp {

	public static void main(String[] args) {
		
		//Compile time invoking of implementation class
		Beverage myBeverage = new Tea();
		System.out.println(myBeverage.prepareBeverage());
		
		myBeverage = new Coffee();
		System.out.println(myBeverage.prepareBeverage());
	}

}
