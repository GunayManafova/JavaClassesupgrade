package com.syntax.classs;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int salary=65000;
String a="Audi";
String b="Mercedes";
String c="Jaguar";
String d="Tesla";
	if(salary>50000) {
		if(salary>=60000) {
System.out.println("You can afford " + a);
	}
		else if(salary>=70000) {
System.out.println("You can afford " + b);			
		}
		else if(salary>=80000) {
System.out.println("You can afford " + c);
		}
		else if(salary>90000) {
System.out.println("You can afford " + d);
		}
		else {
			System.out.println("Save money and wait");
		}
	}else {
		System.out.println("Used car instead");
	}
	System.out.println("-------");
	int a1,b1,c1;
	 a1=8;
	 b1=9;
	c1=7;
	if(a1>b1 && a1>c1) {
		System.out.println(a1 + " is the largest number");
	}else if(b1>a1 && b1>c1) {
		System.out.println( b1 + " is the largest number");
	}else {
		System.out.println(c1 + " is the largest number");
	}
	//Write a program that prints out if it is good weather to go for a bike ride. The weather is good if the temperature is between 60 degrees and 100 degrees inclusive unless it is raining. If temperature is less than 60 program should say
	//it is too cold, if the temperature is more than 100, program should say it is too hot.
	System.out.println("------");
	boolean rain, snow,sunny;
	String activity;
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter temp");
	int temp=input.nextInt();
	if(temp>=40 && temp<80) {
		System.out.println("Is it raining?");
		rain=input.nextBoolean();
		if(rain) {
			activity="Watch a movie";
		}else {
			activity="Go hiking";
		}
	}else if(temp>=25 && temp<40) {
		System.out.println("Is it snowing?");
		snow=input.nextBoolean();
		if(snow) {
			activity="Snowboarding";
		}else {
			activity="Let's code";
		}
		
	}else if(temp>=80) {
		System.out.println("Is it  sunny");
		sunny=input.nextBoolean();
	 if(sunny) {
		activity="Go to the beach";
	}else {
		activity="Do more coding";
	}
	}else {
		System.out.println("Please enter different temp");
		activity="Unknown";
	}
	System.out.println("My activity for today is " + activity);
	System.out.println("-------");
	String month="March";
	int day=3;
	switch(day) {
	case 1:
		month="January";
	break;
	case 2:
		month="February";
		break;
	case 3:
		month="March";
		break;
	case 4:
		month="April";
		break;
	}	
	System.out.println(month);
	System.out.println("-----");
	// Write a program to found out the user level of experience 
    // Must use a switch statement with  a String variable named levelString and a int variable named level 
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
    
    //Declaring String variable  
	String levelString="Expert";
	int level=0;
	switch(levelString) {
	case "Beginner":
		level=1;
		break;
	case "Intermediate":
	level=2;
		break;
	case "Expert":
		level=3;
		break;
		default:
			level=0;
	}
	System.out.println("Your level is " + level);
	
	}
}
