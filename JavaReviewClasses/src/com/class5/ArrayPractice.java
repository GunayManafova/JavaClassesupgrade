package com.class5;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] animals = { "dog", "cat", "mouse", "bird", "donkey", "horse" };
        String[] animals = { "dog", "cat", "bird" };
        for(int a=0; a<animals.length;a++) {
        	System.out.println(animals[a]);
        }
        for(int b=animals.length-1; b>=0; b--) {
        	System.out.println(animals[b]);
        }
        
	}

}
