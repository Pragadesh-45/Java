package com.Pragadesh;
import java.util.Scanner;
public class TypeCasting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// lhs > rhs
		// float num = input.nextFloat();
		// System.out.print(num);


		// TypeCasting
		int num = (int)(12.2f);
		System.out.print(num);


		// automatic type promotion in expression
		int a = 257;
		byte b = (byte)(a);

		System.out.print(b);
	}

}
