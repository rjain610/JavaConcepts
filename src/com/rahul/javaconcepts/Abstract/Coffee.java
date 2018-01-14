package com.rahul.javaconcepts.Abstract;
/**
 * 
 * @author rahul
 *
 */
public class Coffee extends Beverage {

	@Override
	public String prepareBeverage() {
		String prepareCoffee = "\n Your Coffee is getting prepared \n########################\nPlace 1 to 2 teaspoons of instant coffee into a mug."
				+"\nAdd 1 to 2 teaspoons of sugar, if desired."
				+"\nPour in 1 cup (240 milliliters) of boiling water."
		+"\nStir until combined."
		+"\nAdd some milk or creamer, if desired.";
		return prepareCoffee;
	}

}
