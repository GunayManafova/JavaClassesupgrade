package com.practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {12, 15, 11, 13, 9, 25};
int [] a2={12, 15, 11, 13, 9, 25};
int sum=0;
for(int i=0; i<a.length;i++) { 
if (a[i]%2==a2[i]%5) {
	sum+=i*i;
		
	}
}
System.out.println("sum="+ sum);




int array_variable [][]= {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
};
int sum1=0;
for(int i1=0; i1<3;++i1) {
	for(int j=0; j<3;++j) {
		sum1=sum1+array_variable[i1][j];
		
	}

}
System.out.print(sum1/5);



}
}