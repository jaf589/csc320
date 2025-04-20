package module5ct;
import java.util.Scanner;
import java.util.Arrays;

public class Monthlytemp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// initialize variables
		int i; //loop index
		String userStr; //User input - month
		String yearStr = "Year"; //varible if user requests "year"
		String [] monthArr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; // array to hold months
		double [] tempArr = {29, 31, 56, 66, 75, 83, 87, 85, 78, 67, 56, 33}; //array to hold temps		
		// getting user input
		System.out.println("Please enter a month to see that month's average temperature or enter 'year' to see all twelve months.");
		userStr = scnr.nextLine();		
		//for loop to get request month info
		boolean found = false;
		for (i = 0; i < monthArr.length;++i) {
			if (userStr.equalsIgnoreCase(monthArr[i])) {
				System.out.println("Month: "+ monthArr[i] +  " | " +"Temperature: " + tempArr[i]);
				found = true;
				break;
			}
		}
		// if user enters "year"
		if (userStr.equalsIgnoreCase(yearStr)) {
			System.out.println(Arrays.toString(monthArr));
			System.out.println(Arrays.toString(tempArr));
		// enhanced for loop to find the lowest temp	
		double lowestAvg = tempArr[0]; //initialize variable for loop
		for (double temp : tempArr) { 
			if (lowestAvg > temp) {
				lowestAvg = temp;
			}
		}
		System.out.println("The lowest monthly temperature is: " + lowestAvg);
		// enhanced for loop to find the highest temp
		double highestAvg = tempArr[0]; //initialize variable for loop
		for (double temp : tempArr) { 
			if (highestAvg < temp) {
				highestAvg = temp;
			}
		}
		System.out.println("The highest monthly temperature is: " + highestAvg);		
		// enhanced for loop to find the average of the temp array			
		double total = 0;
		for (double temp : tempArr) {
			total  += temp;
		}
		double tempAvg = total / tempArr.length;
		System.out.println("The yearly average temperature is: " + tempAvg);
		}
	}
}
