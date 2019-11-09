package com.java1;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If Task");
		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		double no3 = scan.nextDouble(); 
		if (no1 != no2 || no2 != no3) {
			if (no1 > no2) {
				if (no1 > no3) {// no1>no2 && no1>no3
					System.out.println("Largest number is first - "+ no1);
					} else {// no1>no2 but no1<no3
						System.out.println("Largest number is third - "+ no3);
					}
						} if(no2>no3) {// assuming no2>no1if (no2 > no3) {// no2>num1 && no2>no3 --> no2 =largest
							System.out.println("Largest number is second - " + no2);
							} else {// no2>no1 but no2<no3
								System.out.println("Largest number is third - "+ no3);
							}}else {
									System.out.println("Numbers are equal");
					
				}
		System.out.println("separate");
		int q=2;
		while(q<=20) {
			System.out.println(".");
			if(q%2==0) {
				System.out.println(q);
			}
			q++;
		}
		for(int i=100;i>1;i--) {
			System.out.print(i+ " ");
	}	
	}
}