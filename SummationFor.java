/*
* This program prompts the user to enter an integer and reads the integer to calculate the sum
* of all integers from 1 to the number inputed it will print out the sum of the loop using 
* a for loop. 
*
* @author {user}
* Course: COMP B11
* Created: Mar 5, 2018
* Source File: SummationFor.java
*/
import java.util.Scanner;

public class SummationFor {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int integer;
		
		System.out.printf("Enter N: ");
		integer = input.nextInt();
		
		for(int count = 1; count <= integer; count++ ) {
			sum += count;
		}
		
		
		System.out.printf("The sum of all i, where i runs from 1 to %d equals %d.\n", integer, sum);
		
		input.close();
	}
}