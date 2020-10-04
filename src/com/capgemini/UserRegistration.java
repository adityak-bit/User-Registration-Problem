package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System");
		System.out.println("Enter user first name");

		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if (result == true) {
			System.out.println("Valid user first name");
		} else {
			System.out.println("Invalid user first name");
			System.out.println("First name starts with uppercase and has minimum 3 characters");
		}
	}

}
