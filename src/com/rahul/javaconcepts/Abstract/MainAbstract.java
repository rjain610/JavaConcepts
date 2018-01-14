package com.rahul.javaconcepts.Abstract;



public class MainAbstract {

	public static void main(String[] args) {
		
		
		Beverage myBev = new Tea();
		myBev.prepareBase();
		myBev.prepareBeverage();
		System.out.println(myBev.prepareBeverage());
		myBev.stop();
		

	}

}
