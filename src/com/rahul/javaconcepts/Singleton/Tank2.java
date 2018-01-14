package com.rahul.javaconcepts.Singleton;

public class Tank2 {

	
	private   int waterCapacity; // litres

	
	public Tank2() {
		waterCapacity = 100;
	}
	
	
	
	public  int getWater(int waterReq) {
		
		int remaining =  waterCapacity - waterReq;
		waterCapacity = remaining;
		return remaining;
	}



	


	
	
	
}
