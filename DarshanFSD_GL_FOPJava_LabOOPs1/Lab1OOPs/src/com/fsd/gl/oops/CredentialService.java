package com.fsd.gl.oops;

import java.util.Random;

public class CredentialService {
		public String generatePassword() {
			String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		      String specialCharacters = "!@#$";
		      String numbers = "1234567890";
		      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		      int length=8;
		      Random random = new Random();
		      char[] password = new char[length];

		      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		      password[3] = numbers.charAt(random.nextInt(numbers.length()));
		   
		      for(int i = 4; i< length ; i++) {
		         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
		      return String.valueOf(password);
			
			
		}
		
		public String generateEmailAddress(String fname, String lname, String department) {
			return fname+lname+"@"+department+".abc.com";
		}
		
		public void showCredentials(String fname, String lname, String department) {
			
			System.out.println("Email------>"+generateEmailAddress(fname, lname, department));
			System.out.println("Password--->"+generatePassword());
		}
}
