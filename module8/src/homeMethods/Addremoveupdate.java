package homeMethods;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import homeInventory.*;

public class Addremoveupdate {
		// arraylist
		ArrayList<Home> homeList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		//method to add home to arraylist
		public void addhome() {
			System.out.println("Adding new home");
			System.out.println("Enter square feet of the home:");
			int squareFeet = scnr.nextInt();
			scnr.nextLine();
			System.out.println("Enter address of the home:");
			String address = scnr.nextLine();	
			System.out.println("Enter city of the home:");
			String city = scnr.nextLine();	
			System.out.println("Enter state of the home:");
			String state = scnr.nextLine();
			System.out.println("Enter zip code of the home:");
			int zipCode = scnr.nextInt();
			scnr.nextLine();
			System.out.println("Enter model name of the home:");
			String modelName = scnr.nextLine();
			System.out.println("Enter sale status of the home:");
			String saleStatus = scnr.nextLine();
			Home newHome = new Home(squareFeet, address, city, state, zipCode, modelName, saleStatus);
			homeList.add(newHome);
			System.out.println("Home added");		
			System.out.println(newHome);
			System.out.println("                  ");
		}
		// method to remove a home from arraylist
		public void removeHome() {
			int i;
			for (i = 0; i < homeList.size();++i) {
				System.out.println(homeList.get(i));
				System.out.println("                  ");
			}	
		System.out.println("Please select which home to remove(the list starts with 0):");	
		int c = scnr.nextInt();
		if (c >= 0 && c < homeList.size()) {
			homeList.remove(c);
			System.out.println("Home removed");
			System.out.println("                  ");
			System.out.println("Updated home inventory:");
			System.out.println("                  ");
			System.out.println(homeList);
			System.out.println("                  ");
			}
		}
		// method to update parameters on selected home object
		public void updateHome() {		
			int x = scnr.nextInt();	
			if (x >= 0 && x < homeList.size()) {
				System.out.println("Updating home");
				System.out.println("                  ");
				System.out.println("Enter square feet of the home:");
				int newsquareFeet = scnr.nextInt();
				scnr.nextLine();
				System.out.println("Enter address of the home:");
				String newAddress = scnr.nextLine();	
				System.out.println("Enter city of the home:");
				String newCity = scnr.nextLine();	
				System.out.println("Enter state of the home:");
				String newState = scnr.nextLine();
				System.out.println("Enter zip code of the home:");
				int newzipCode = scnr.nextInt();
				scnr.nextLine();
				System.out.println("Enter model name of the home:");
				String newmodelName = scnr.nextLine();
				System.out.println("Enter sale status of the home:");
				String newsaleStatus = scnr.nextLine();	
				System.out.println("                  ");
				homeList.set(x,new Home(newsquareFeet, newAddress, newCity, newState, newzipCode, newmodelName, newsaleStatus));
				System.out.println("Home Updated");
				System.out.println("                  ");
			}
			
		}
		// method to show homes in arraylist
		public void showHomes() {
			int i;
			for (i = 0; i < homeList.size();++i) {
				System.out.println(homeList.get(i));		
				System.out.println("                  ");
			}		
		}
		// method to print home inventory to a text file
		public void printInventory() {			
			System.out.println("would you like to print home inventory list to a file ?(Y or N)");	
			String u = scnr.nextLine();	
			
			if (u.equalsIgnoreCase("Y")); {
				System.out.println("Y: Printing to file");			
				try {
					FileOutputStream fos = new FileOutputStream("C:/Users/jaf23/OneDrive/Desktop/csc320/Home.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(homeList);
					System.out.println("Home Inventory written to file");
					System.out.println("                  ");
					oos.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}	
		}	
}
