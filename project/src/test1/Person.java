package test1;

import java.util.Scanner;
public class Person {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      
	      // initialize variables
	      String firstName;
	      String lastName;
	      String address;
	      String city;
	      String zip;
	 
	      // asking for user input
	      System.out.println("Please enter first name:");
	      firstName = scnr.nextLine();
	      System.out.println("Please enter last name:");
	      lastName = scnr.nextLine();	      
	      System.out.println("Please enter address:");
	      address = scnr.nextLine();
	      System.out.println("Please enter city:");
	      city = scnr.nextLine();
	      System.out.println("Please enter zip code:");
	      zip = scnr.nextLine();

	      //print put user input
	      System.out.print("First Name: "); 
	      System.out.println(firstName);	 
	      System.out.print("Last Name: ");
	      System.out.println(lastName);
	      System.out.print("Address: ");
	      System.out.println(address);	      
	      System.out.print("City: ");
	      System.out.println(city);
	      System.out.print("Zip Code: "); 
	      System.out.println(zip);  	     	      
	   }
	}


