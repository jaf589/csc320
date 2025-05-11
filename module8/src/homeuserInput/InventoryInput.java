package homeuserInput;

import java.util.ArrayList;
import java.util.Scanner;
import homeInventory.*;
import homeMethods.Addremoveupdate;
public class InventoryInput {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Addremoveupdate userinput = new Addremoveupdate();
		while (true){
			// user menu to select which option they would like
			System.out.println("Please select an option:");
			System.out.println("1: Add Home");
			System.out.println("2: Remove Home");
			System.out.println("3: Update Home");	
			System.out.println("4: Show Home Inventory");
			System.out.println("5: Print Home Inventory to a file ");
			
			int userMenu; 
			userMenu =  scnr.nextInt();
			
			switch(userMenu) {		
				case 1 :
					userinput.addhome();
					break;						
				case 2:
					userinput.removeHome();
					break;
				case 3:
					userinput.updateHome();
					break;
				case 4:
					userinput.showHomes();
					break;
				case 5:
					userinput.printInventory();
					break;
				default:	
					System.out.println("Please try again.");
					System.out.println("                  ");
					break;
			}
		}
		
		

		
	}
}
