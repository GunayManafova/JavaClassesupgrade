package com.class4;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 0ne Print numbers from 10 to 1
		 
		// Task Two Write a program from 40 to 10 and only print the even numbers
	   
	    // Task Three Write a program from 50 to 25 and only print the odd numbers
		
		// Task Four Write a program from 0 to 100 and break the loop once the value  reaches 45
		
		// Task Five Write a program  1 to 10 and if the value is 10 
		for(int i=10;i>=1;i--) {;
			System.out.println(i);
		}
			System.out.println("------");
		for( int a=40;a>=10;a--) {
		if(a%2==0) {
			System.out.println(a);
		}
		}
	System.out.println("------");	
	for(int c=50;c>=25;c--) {
		if(c%2!=0) {
		System.out.println(c);
	}
	}
System.out.println("------");
for(int b=0;b<=100;b++) {
	System.out.println(b);
if(b==45) {
	break;
}
}
System.out.println("------");
for(int i=1; i<=11; i++) {
	if(i==10) {
	continue;
	}
	System.out.println(i);
	}
}
}
