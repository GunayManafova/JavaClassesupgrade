package com.class4;

import java.util.Scanner;

public class DoWhilePractice {

	public static void main(String[] args) {
//		Task One	
			/* print only even numbers from 1 to 20 */
			//Task Two
			/* how to print numbers from 5 to 25 inclusive all in 1 line with space in
			         * between?
					  //Task Three 
		 
		 
		 */
			/* Prompt the user to ask the name 3 times and print "Hello____" */
int i=1;
while(i<20) {
	i++;
	if(i%2==0) {
	System.out.println(i);
}
}
/////////////////////
int a=5;
while(a<=25) {
	
	System.out.print(a+ " ");
	a++;
}
/////////
Scanner input=new Scanner(System.in);
System.out.println("Enter your name:");
String name=input.nextLine();
int c=1;
while(c<=3) {
System.out.println("Hello " + name);
c++;





	}
}
}
