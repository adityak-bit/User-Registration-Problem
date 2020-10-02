package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System");
		System.out.println("Enter user last name");

		Scanner sc = new Scanner(System.in);
		String lastName = sc.nextLine();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();

		if (result == true) {
			System.out.println("Valid user last name");
		} else {
			System.out.println("Invalid user last name");
			System.out.println("Last name starts with uppercase and has minimum 3 characters");
		}
	}

}
