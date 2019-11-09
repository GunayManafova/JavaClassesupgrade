package com.class5;

public class NestedForLoopsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int floor = 1; floor <= 4; floor++) {
	            System.out.print("Floor " + floor + " -> ");
	            for (int room = 1; room <= 6; room++) {
	                System.out.print(floor + "." + room + " ");
	            }
	            System.out.println();
	        }

	}

}
