package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class UserRegistration       {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System");
		System.out.println("Enter user mobile number");

		String mobileNumber = sc.nextLine();

		Pattern pattern = Pattern.compile("^([0-9]{2})\\s([0-9]{10})$");
		Matcher matcher = pattern.matcher(mobileNumber);
		boolean result = matcher.matches();

		if (result == true) {
			System.out.println("Valid user mobile number");
		} else {
			System.out.println("Invalid user mobile number");
		}
	}

}
