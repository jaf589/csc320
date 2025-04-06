package module3ct;

import java.util.Scanner;

public class withholding {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// initialize variable 
		double userIncome;
		double taxesIncome = 0;
		double fIncome = 0;
		
		// asking user input
		System.out.print("Enter your weekly income: ");
		userIncome =  scnr.nextDouble();
		
		// if-else branches
		if (userIncome < 500.00) {
			taxesIncome  = userIncome * 0.10;
			fIncome = userIncome - taxesIncome; 
		}
		else if (userIncome >= 500.00 && userIncome < 1500.00) {
			taxesIncome  = userIncome * 0.15;
			fIncome = userIncome - taxesIncome;
		}
		else if (userIncome >= 1500.00 && userIncome < 2500.00) {
			taxesIncome  = userIncome * 0.20;
			fIncome = userIncome - taxesIncome;
		}
		else if (userIncome >= 2500) {
			taxesIncome  = userIncome * 0.30;
			fIncome = userIncome - taxesIncome;
		}
		// output
		System.out.println("Income after taxes: " +  fIncome);
		System.out.println("Weekly average tax witholding: " +  taxesIncome);
	}

}
