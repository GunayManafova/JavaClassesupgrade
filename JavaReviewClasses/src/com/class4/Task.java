package com.class4;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until entered price is not equal to 3
	   //  *after user got a write amount print "Please enjoy your candy"*/  
		int i=0;
		do {
			if(i%2==0) {
				System.out.println(i);
			} i++;
		}while(i<=15);
    System.out.println("-----------");         	
int answer;
Scanner input=new Scanner(System.in);
   do {
	   System.out.println("Pay for your candy");
	    answer=input.nextInt();
   }while(answer!=3);
   System.out.println("Enjoy candy");
    
        
        
        	
	}
	}

