package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class UserRegistration       {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System");
		System.out.println("Enter user email id");

		String emailId = sc.nextLine();

		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+-]+(?:\\."+ 
				                           "[a-zA-Z0-9_+-]+)*@"  + 
				                           "(?:[a-zA-Z0-9-]+\\.){1,2}+[a-z" + 
				                           "A-Z]{2,7}$");
		Matcher matcher = pattern.matcher(emailId);
		boolean result = matcher.matches();

		if (result == true) {
			System.out.println("Valid user email id");
		} else {
			System.out.println("Invalid user email id");
		}
	}

}
