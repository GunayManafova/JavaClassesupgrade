package com.syntax.datatypes;

import java.util.Scanner;

public class DataTypes {
	static int myNumber;

	public static void main(String[] args) {
		double d1 = 5;//implicit casting
		System.out.println(d1);
		int k = (int)5.5;//explicit casting, type casting
		System.out.println(k);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a floating point number: ");
		double value1=input2.nextDouble();
		System.out.println("You entered: " + value1);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int value = input1.nextInt();
		System.out.println("You entered: " + value);
		
		Scanner bucky = new Scanner(System.in);
		System.out.println(bucky.nextLine());
		Scanner bucky1 = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1=bucky1.nextInt();
		System.out.print("Input second number: ");
		int num2=bucky1.nextInt();
		System.out.println(num1 +  "+" +  num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		
		
		byte myByteNumber = -127;// 1byte memory which is 8 bits
		int myIntNumber;// 4 bytes of memory
		short myShortNumber;
		long myLongNumber;
		boolean myBoolean = true;
		float myFloat;
		double myDouble;
		String name = "John";
		System.out.println("My nameis:\nJohn Smith");
		/*
		 * 
		 */

		System.out.println(myNumber);
		int a, b, c;
		a = 4;
		b = 13;
		c = 8;
		if (a > b && a > c) {
			System.out.println("A");
		} else if (b > c) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

		int age = 60;

		if (age < 50) {
			System.out.println("You are young");
		} else {
			System.out.println("You are old");
		}
		if (age > 75) {
			System.out.println("You are reALLY OLD");
		} else {
			System.out.println("don't worry you aren't really old");
		}

	}

}