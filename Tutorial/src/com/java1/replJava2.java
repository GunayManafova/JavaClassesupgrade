package com.java1;

import java.util.Scanner;

public class replJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Note: Create a Scanner Class

		//Create an int array with the size of 5 and input values with Scanner. 
		//Create a loop and enter values into one loop (don't print prompt question for Scanner). 
		//Create the second loop to print the values and it must be multiplied by 10.
		//Print out each element of the array multiplied by ten, one element per line.
		Scanner input=new Scanner(System.in);
		int[] num=new int[5];
		for(int a=0; a<num.length;a++) {
			num[a]=input.nextInt();
		}
		
		for(  int a=0;a<num.length;a++) {
			System.out.println(num[a] *10);
		}
		System.out.println("-------------");
	//	Write a program that creates an array of strings with the size being 7. 
	//	Ask the user to input Days of a week beginning with Sunday using Scanner class.
	//	Add these inputs to your array and then print all values from that array	
		String [] array= new String[7];
		
		for(int a=0;a<array.length;a++) {
			System.out.println("Please say the " + (a+1)+ "days of the week");	
		array[a]=input.next();	
		}
		for(int b=0; b<=array.length-1;b++) {
			System.out.println(array[b]);
		}
		}
	Scanner sc = new Scanner(System.in); 
	  System.out.println("Enter the browser name to proceed further with execution");
	   String browser = sc.nextLine(); 
	   if(browser==ChRoME) {
	   browser.equalsIgnoreCase();
	    System.out.println("Proceed with Chrome browser");
	     
	   }else if(browser==FireFOX) {
	     System.out.println("Proceed with Firefox browser");
	   } else if (browser==IE) {
	     System.out.println("Proceed with IE browser");
	   }else {
	     System.out.println("Invalid browser");
	   }
		
	}
}
