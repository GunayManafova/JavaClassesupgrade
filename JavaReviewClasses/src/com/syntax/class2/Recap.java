package com.syntax.class2;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=12;
		System.out.println();
		String name1="John";
		String name2="Smith";
		System.out.println(name1.equals(name2));
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter in First Number: ");		
        int num1=scan.nextInt();
       System.out.println("Enter the operator");
       String operator=scan.next();
       System.out.println("Enter the second number: ");
       int num2=scan.nextInt();
       if(operator.equals("+")) {
    	   System.out.println(num1+num2);
       }else if (operator.equals("-")) {
    	   System.out.println(num1-num2);
       }else if(operator.equals("/")) {
    	   System.out.println(num1/num2);
       } else if(operator.equals("*")) {
    	   System.out.println(num1*num2);
       }else {
    	   System.out.println("Invalid operator");
    	   
       }
	}

}
