package com.bridgelabz;
import java.util.Scanner;

public class UserRegistractionUC5 {

	public static void main(String[] args) {
		// get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Passord:");
		String password = scanner.nextLine();

		// validate user input and display error message
		System.out.println("\nValidate Result:");
		if(!validatePassword(password))
			System.out.println("Invalid Mobile No");			
		else
			System.out.println("Valid Input. Thank you.");
	}

//	 validate rule 1 Password
	
	private static boolean validatePassword(String password) {
		return password.matches("[a-z]{8}");
	}
}
