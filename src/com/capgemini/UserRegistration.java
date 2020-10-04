package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class UserRegistration       {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System");
		System.out.println("Enter user password");

		String password = sc.nextLine();

		Pattern pattern = Pattern.compile("^[A-Za-z0-9.-_+@*]{8,}");
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();

		if (result == true) {
			System.out.println("Password : Rule 1 satisfied");
		} else {
			System.out.println("Invalid user password");
			System.out.println("Password must be of minimum 8 characters");
		}
	}

}
