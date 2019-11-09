package com.practice;



public class DiaginalStar {
	public static void main(String[] args) {
		
		
	int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
int max=0;
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a[i].length; j++) {
	if(a[i][j]>max)	 {
		max=a[i][j];
	}
	}

}
System.out.println(max);
System.out.println("----------");
int [][] array={
        {1, 1, 1,},
        	{1,1,1,},
        	{1,1,1,}
};
boolean flag = false;

for (int i = 0; i < array.length; i++) {
	if (array.length == array[i].length){
		flag = true;
	}
	break;
}
System.out.println(flag);
System.out.println("------------");
int[][] nums = {
		{1,1,2}, //sum = 4
		{3,1,2}, //sum = 6
		{3,5,3}, //sum = 11
		{0,1,2}  //sum = 3
	};
int sum=0;
int row=3;
for(int j=0; j<nums[row].length;j++) {
	sum=sum+ nums[3][j];
}
System.out.println(sum);
System.out.println("--------------");
int[][] a1 = {
		{-5,-2,-3,7},
		{1,-5,-2, 2},
		{1,-2, 3,-4}
	};

int [] array1= {86, 14, 32, 14, 35};
for (int i = 0; i < array1.length; i++) {
	for(int j=i+1;j<array1.length;j++) {
		if (array1[i]==array1[j]) {
			System.out.println(array1[j]);
		}
	}
}
}
	}	


		
		
		
		
			
		
			     
			
			


		
		
		
		
			
  

		
	  
	    
	     








		
		
		    
		      

		    
		    
		

	

