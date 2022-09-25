package com.bridgelabz;
import java.util.Scanner;


public class UserRegistractionUC4 {

	public static void main(String[] args) {
		// get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name:");
		String firstName = scanner.nextLine();

		System.out.println("Please enter last name:");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter email id:");
		String emailId = scanner.nextLine();
		
		System.out.println("Please enter mobile no:");
		String mobile = scanner.nextLine();

		// validate user input and display error message
		System.out.println("\nValidate Result:");

		if (!validateFirstName(firstName))
			System.out.println("Invalid First Name");
		else
		if(!validateLastName(lastName))
			System.out.println("Invalid Last Name");
		else
		if(!validateEmailId(emailId))
			System.out.println("Invalid Email ID");
		else
		if(!validateMobile(mobile))
			System.out.println("Invalid Mobile No");
			
		else
			System.out.println("Valid Input. Thank you.");
	}

//	 validate first name
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z]{1}[a-z]{3}");
	}

	private static boolean validateLastName(String lastName) {
		return lastName.matches("[A-Z]{1}[a-z]{3,6}");
	}
	
	private static boolean validateEmailId(String emailId) {
		return emailId.matches("[a-z]{3}(.+)[a-z]{3}@[bl](.+)[co](.+)");
	}
	
	private static boolean validateMobile(String mobile) {
		return mobile.matches("(91)?[7-9][0-9]{9}");
	}
}
