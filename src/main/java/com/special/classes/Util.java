package com.special.classes;

import java.util.Date;

public class Util {
//	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
		 
	//}
	
		public static String emailWithDateTimeStamp() {//make shure this method is static, because you can't call this method
			Date date = new Date();
			System.out.println(date);
			String emailTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
			System.out.println(emailTimeStamp);
			return "seleniumpanda" + emailTimeStamp + "@gmail.com";//use this method 

		}
		

	}
//This code defines a Java method named emailWithDateTimeStamp that generates an email address with a timestamp. Here's an explanation of how it works:
//
//Date Object Creation: It starts by creating a Date object named date. This object represents the current date and time when this line of code is executed.
//
//Printing the Date: The code then prints the value of the date object to the console using System.out.println(date);. This line helps you see the original date and time for reference.
//
//Timestamp Generation: The code generates a timestamp for the email by formatting the date object. It uses the toString() method to convert the Date object into a string. The resulting string includes spaces and colons, which are not suitable for an email address. So, it performs two replacements:
//
//.replace(" ", "_") replaces spaces with underscores.
//.replace(":", "_") replaces colons with underscores.
//The idea is to make the timestamp string suitable for an email address.
//
//Printing the Timestamp: After performing the replacements, the code prints the modified emailTimeStamp to the console using System.out.println(emailTimeStamp);. This line allows you to see the timestamp that will be part of the email address.
//
//Email Address Composition: Finally, the method returns a string that combines "seleniumpanda" (a fixed part), the generated emailTimeStamp (the timestamp generated based on the current date and time), and "@gmail.com" (the domain part). The email address is constructed as "seleniumpanda" + emailTimeStamp + "@gmail.com".
//
//In summary, this code is useful for generating unique email addresses with a timestamp to ensure they are distinct. It's common to use such email addresses for testing or other purposes where uniqueness is required. The timestamp helps make each email address different, and underscores are used to replace characters that are not allowed in an email address.







