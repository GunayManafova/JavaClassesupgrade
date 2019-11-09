package com.syntax.classs;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex  Class notes.
        /* if number is between 1-10 -->this number is small
         * if number is between 10-100 --> this number is medium
         * if number is between 100-1000 --> this number is large
         * any other number --> is out of the range
         */
      int num=200;
//            true AND false --> false
      if (num>1 && num <10) {
      System.out.println("this number is small");
      // true AND false --> false
      }else if (num>=10 && num<100) {
      System.out.println("this number is medium");
      //true AND true --> true
      }else if (num>=100 && num <1000) {
      System.out.println("this number is large");
      }else {
      System.out.println("Number is out of range");
      }
      
    //Write a program to find if the largest Number of three numbers
      //Print out  System.out.println("Largest number is " + largestNumber);
       // Must use if then a else if and lastly else 
      int a=8;
      if(a%2==0) {
    	  System.out.println("My number must be  even");
      }else {
    	  System.out.println("My number must be odd");
      }
      int num1=5;
      int num2=8;
      int num3=7;
      if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is the largest number");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " is the largest number");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3 + " is the largest number");
		}
		else {
			System.out.println("All the numbers are equal");
		}
	
	}
}

