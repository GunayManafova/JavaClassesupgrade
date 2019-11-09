package com.class5;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int [] num=new int[5];
		num[0]=9;
		num[1]=7;
		num[2]=3;
		num[3]=2;
		num[4]=6;
		int sumArray=0;
		for(int a=0;a<num.length;a++) {
			System.out.print(num[a]);
		
			sumArray=sumArray+num[a];
		}
		System.out.println();
			System.out.println(sumArray);
			System.out.println("-------");
			int[] num1= {7, 6, 5, 4, 3};
		int sumB=0;
		for( int b=0;b<num1.length;b++) {
			System.out.print(num1[b]);
			sumB+=num1[b];
		}
		System.out.println();
		System.out.println(sumB);
		System.out.println("-----------");
		String[] animals= {"Cat", "Dog", "Bird"};
		for(int c=0; c<animals.length; c++) {
			System.out.println(animals[c]);
		}
		
		
        
	}
}
