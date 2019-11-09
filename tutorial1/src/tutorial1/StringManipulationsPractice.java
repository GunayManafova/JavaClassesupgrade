package tutorial1;

import java.util.Scanner;

public class StringManipulationsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("PlEASE ENTER YOUR USERNAME");
		String username=input.nextLine();
		System.out.println("Please enter password");
		String confirmPassword=input.nextLine();
		System.out.println("Please confirm your password");
		String password =input.nextLine();
		System.out.println(username.isEmpty());
		System.out.println(password.isEmpty());
		boolean empty=false;
		if(empty) {
			System.out.println("Username and password cannot  be empty");
			System.out.println(password.length());
		}else if(password.length()<8) {
				System.out.println("Password too short");
			}else 	if(password.contains(username)) {
					System.out.println("Password cannot contain username");
			}else 	if(password.contains(confirmPassword)) {
						System.out.println("password matches");
					} else {
						System.out.println("Passwords do not match");
						
					}
			System.out.println("Your username and password has been created");	
			
	}

}
