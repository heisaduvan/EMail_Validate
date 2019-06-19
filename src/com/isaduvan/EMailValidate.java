package com.isaduvan;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EMailValidate {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		        return matcher.find();
		}
		
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		String email = "";
		
		

			do {
				
				System.out.print("E-mail adresinizi giriniz : " );

				email = input.next();

				//System.out.println(email);

				if (validate(email)) {

						System.out.println(email+" email adresidir");

				} else {

						System.out.println(email+" email degil");

				} 
				
			} while (true);
			
	}

}
