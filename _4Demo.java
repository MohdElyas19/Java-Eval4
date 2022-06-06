package com.eval3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _4Demo {

	public static void main(String[] args) {
		
		_4Customer c1 = new _4Customer();
		String name = c1.username;
		String pass = c1.password;
		String mobile = c1.mobileNumber;
		String email = c1.email;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		name = sc.next();
		
		System.out.println("Enter password");
		pass = sc.next();
		
		System.out.println("Enter mobile");
		mobile = sc.next();
		
		System.out.println("Enter email");
		email = sc.next();
		
		
		
		
		System.out.println(name);
		System.out.println(pass);
		System.out.println(mobile);
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}","mobile"));
		System.out.println(email);

	}

}
