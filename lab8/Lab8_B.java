package lab8;

import java.util.Scanner;

public class Lab8_B {
	
	public static void main(String[] args) {
		
		
		String[] students = {"Ensley", "Luna", "Luna", "Oaklynn", "Amora", "Aurora", "Mila", 
					"Yara", "Selene", "Everlee", "Bryson", "Greyson", "Lincoln", "Reign", 
					"Kashton", "Caspian", "Gatlin", "Roman", "Easton", "Carson"};						
		String[] hometown = {"Muskegon Heights", "Detroit", "Benton Harbor", "St. Joseph", "Kalamazoo", 
					"Flint", "Jackson", "Highland Park", "Albion", "Ecorse", "Muskegon Heights", "Benton Harbor", 
					"Lincoln", "St. Joseph", "Kalamazoo", "Flint", "Jackson", "Highland Park", "Albion","Ecorse"};
		
		String[] favoriteFood = {"pizza", "Taco Bell", "Mongolian", "waffles", "Italian", "cereal",
					"bacon", "steak", "sushi", "pork", "ramen", "BBQ", "Chinese",
					"oysters", "cheese", "lasagna", "burgers", "pancakes", "apple pie", "ravioli"};
		
		String userContinue3 = null;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println(students);
		
		System.out.println("Welcome to our java class. Which student would you like to know more about?(1-20)");
		int userInput = scnr.nextInt();
		
		do {
			
			try {
		
				System.out.println("Student number " + userInput + " is " + students[userInput - 1] + ".");
		
				System.out.println("Would you like to more about " + students[userInput - 1] + "? (yes/no)");
				String userContinue = scnr.next();
		
				if (userContinue.equals("yes")) {
					System.out.println("Hometown or favorite food?");
					String userContinue2 = scnr.next();
					if (userContinue2.equalsIgnoreCase("Hometown")) {
						System.out.println(students[userInput - 1] + "'s hometown is " + hometown[userInput - 1] + ".");
					}
					if (userContinue2.equalsIgnoreCase("favorite food")) {
						System.out.println(students[userInput - 1] + "'s favorite food is " + favoriteFood[userInput - 1] + ".");
					}
					else {
						System.out.println("Sorry, we don't know.");
					}
				} else {
			System.out.println();
			}
		
			} catch (IndexOutOfBoundsException ex) {
 				System.out.println("That student does not exist.");
			}
			
			System.out.println("Would you like to know about a another student?");
			
		} while (userContinue3.equals("yes")); 
 		
	}
}




