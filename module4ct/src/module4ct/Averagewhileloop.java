package module4ct;
import java.util.Scanner;

public class Averagewhileloop {
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in);
		   //initialize variable
		   double firstNum;
		   double secondNum;
		   double thirdNum;
		   double fourthNum;
		   double fifthNum;    
		   double total;
		   double average;
		   double interest;
		   double max;
		   double min;
		   int count;
		   
		   System.out.println("Please enter five floating-point values ");
		  // initialize loop control variable
		   count = 0;
		  // loop 
		   while (count < 5) {
			   // user input
			   System.out.println("Please enter first number:");
			   firstNum = scnr.nextDouble();
		       count = count + 1; 
		       System.out.println("Please enter second number:");
			   secondNum = scnr.nextDouble();
		       count = count + 1; 
		       System.out.println("Please enter third number:");
			   thirdNum = scnr.nextDouble();
		       count = count + 1; 
		       System.out.println("Please enter fourth number:");
			   fourthNum = scnr.nextDouble();
		       count = count + 1; 
		       System.out.println("Please enter fifth number:");
			   fifthNum = scnr.nextDouble();
		       count = count + 1; 
		       // output
		       total = firstNum + secondNum + thirdNum + fourthNum + fifthNum;
		       System.out.println("Total:" + total);		       
		       average = total / 5;
		       System.out.println("Average:" + average);		       
		       max = Math.max(firstNum, Math.max(secondNum, Math.max(thirdNum,Math.max(fourthNum,fifthNum)))); 
		       System.out.println("Maximum:" + max);		       
		       min = Math.min(firstNum, Math.min(secondNum, Math.min(thirdNum,Math.min(fourthNum,fifthNum)))); 
		       System.out.println("Minimum:" + min);		       
		       interest = total * 0.20;
		       System.out.println("Interest on total at 20%:" + interest); 
		    }	   		     
	}
}
