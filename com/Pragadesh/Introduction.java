package com.Pragadesh;

public class Introduction {
	public static void main(String args[]) {

		System.out.println("a is printed");

		Student[] students = new Student[5];

		Student Pragadesh;
		System.out.println(Arrays.toString(students));

	}


}


class Student {
	int[] rno = new int[5];
	String[] name = new String[5];
	float[] marks = new float[5];
}