package com.bridgelabz;
import java.util.regex.*;


public class UserRegistraction {

	public static void main(String args[]) {
		/*
		 * First name starts with Cap and has minimum 3 characters
		 * 1st way
		 */


		Pattern ptr = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher mtr = ptr.matcher("Ramesh");
		Matcher mt = ptr.matcher("Ra");
		boolean result = mtr.matches();
		boolean res = mt.matches();

		System.out.print("1st way:-"+result);
		System.out.print("- "+res);

		/*
		 * 2nd way		
		 */
		boolean result1 = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher("Java").matches();
		System.out.println("\n2nd Way:-"+result1);

		/*
		 * 3d way
		 */

		boolean result3 = Pattern.matches("[A-Z]{1}[a-z]{2,}","ram");
		System.out.println("3rd way:"+result3);
	}
}
