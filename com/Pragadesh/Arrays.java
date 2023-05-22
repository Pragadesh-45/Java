package com.Pragadesh;


public class Arrays {
	public static void main(String[] args) {
		

		// String cars[] = {"Camaro", "Mustang", "Lancer"};

		// cars[0] = "Tesla";

		// System.out.println(cars[0]);


		String[] cars = new String[3];

		cars[0] = "Chervolet";
		cars[1] = "Contesa";
		cars[2] = "Mustang";

		for(int i = 0; i<cars.length; i++) {
			System.out.println(cars[i]);

		}

	}
}