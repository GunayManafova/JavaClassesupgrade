import java.util.Scanner;

public class Practice2 {
		public static void main(String[] args) {
			//Write a program that creates an array of strings with the size being 7. 
			//Ask the user to input Days of a week beginning with Sunday using Scanner class.
			//Add these inputs to your array and then print all values from that array

			Scanner input = new Scanner(System.in);
			String [] days=new String[7];
			for(int a=0;a<days.length;a++) {
			System.out.println("Enter day " + (a+1) +"week");
		days [a]=input.next();
		}
			for(int a=0; a<=days.length-1;a++ ) {
			System.out.println(days[a]);
		}
}
}
     
		
		
			
		
		
		
		

	


