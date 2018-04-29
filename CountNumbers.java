/*
* This program prompts the user to enter a sequence of numbers, ending with 'Q' to quit,
* read the numbers, keeping a separate sum of negative and positive numbers, and will display
* the sum for positive and negative sums.
*
* @author {user}
* Course: COMP B11
* Created: Mar 7, 2018
* Source File: CountNumbers.java
*/
import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		double number;
		double positiveSum = 0;
		double negativeSum = 0;
	
		System.out.println("Enter numbers (Q to quit): ");
		while (in.hasNextDouble())
		{
			number = in.nextDouble();
			
			if (number > 0) 
				positiveSum = positiveSum + number;
			
			else 
			negativeSum = negativeSum + number;
		}
		System.out.printf("Total of positive numbers is %.4f\n", positiveSum);
		System.out.printf("Total of negative numbers is %.4f\n", negativeSum);
		in.close();
	}
}