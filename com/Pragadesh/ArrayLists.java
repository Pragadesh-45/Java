package com.Pragadesh;
import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		// ArrayList = a resizable array;

		ArrayList<String> food = new ArrayList<String>();
		food.add("Parotta");
		food.add("Biriyani");
		food.add("Dosa");

		food.set(0, "Idly");
		// food.remove(2);
		// food.clear();

		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}