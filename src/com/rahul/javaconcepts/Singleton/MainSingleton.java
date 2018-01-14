package com.rahul.javaconcepts.Singleton;

import java.util.Scanner;

public class MainSingleton {

	public static void main(String[] args) {

		System.out.println("Enter water");
		Scanner reader = new Scanner(System.in); // Reading from System.in
		int waterReq = reader.nextInt();

		// Tank t = new Tank(); cannot create object using constructor

		Tank t = Tank.getTank();
		System.out.println("Water remaining in tank " + t.getWater(waterReq));

		System.out.println("Again Enter water");
		reader = new Scanner(System.in); // Reading from System.in
		waterReq = reader.nextInt();
		reader.close();
		
		Tank t2 = Tank.getTank();
		System.out.println("Now Water remaining in tank " + t2.getWater(waterReq));

		
		if(t.equals(t2)) {
			System.out.println("Both objects are same");
		} else {
			System.out.println("Both objects are different");
		}
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
