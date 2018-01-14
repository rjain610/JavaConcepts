package com.rahul.javaconcepts.Singleton;

public class Tank {
	
	private  int waterCapacity; // litres
	private static Tank tank;
	/**
	 * To make it class singleton , hide constructor from the other class
	 */
	private Tank() {
		waterCapacity = 100;
	}
	/**
	 * creates object only when first time getTank() is called 
	 * Lazy initialization
	 * @return
	 */
	public static Tank getTank() {
		if( tank == null) {
			 tank = new Tank();
			 return tank;
		} else {
			return tank;
		}
	}
	
	public  int getWater(int waterReq) {
		
		int remaining =  waterCapacity - waterReq;
		waterCapacity = remaining;
		return remaining;
	}

	
	

}
