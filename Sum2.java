/*
* This program prompts the user to enter two integers and will display the two integers
* and the sum of the two.
*
* @author {user}
* Course: COMP B11
* Created: Feb 14, 2017
* Source File: Sum2.java
*/
import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		int firstInt;
		int secondInt;
		int sum;
		
		System.out.print("Enter two integers\n");
		firstInt = input.nextInt();
		secondInt = input.nextInt();
		
		sum = firstInt + secondInt;
		
		System.out.printf("The sum of %d and %d is %d.\n", firstInt, secondInt, sum);
		
		input.close();
	}
}