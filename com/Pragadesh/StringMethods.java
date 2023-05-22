package com.Pragadesh;

public class StringMethods {
	public static void main(String[] args) {
		String name = "Pragadesh";

		// boolean result = name.equals("Pragadesh");
		boolean result = name.equalsIgnoreCase("pragadesh");

		System.out.println(result);
	}
}