package com.rahul.javaconcepts.Abstract;

public class Tea extends Beverage{

	@Override
	public String prepareBeverage() {
		
	    String teaRecipe = "\n Your tea is getting prepared \n########################\nBoil water in a saucepan."
	    +"\nAdd sugar and tea powder in it and boil it for 3-4 minutes on medium flame."
	    +"\nAdd milk and boil it over medium flame for 6-7 minutes or until bubble starts to rise. You will see the change in color of the tea from milky shade to brown shade when it is ready."
	    +"\nTurn off the gas and strain tea in cups.";
		return teaRecipe;
	}

}
