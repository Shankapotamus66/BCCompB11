/*
* This program prompts the user to enter an integer and reads the integer to calculate the sum
* of all integers from 1 to the number inputed it will print out the sum of the loop using a 
* while loop. 
*
* @author {user}
* Course: COMP B11
* Created: Feb 28, 2018
* Source File: Summation.java
*/
import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int count = 1;
		int integer;
		
		System.out.printf("Enter N: ");
		integer = input.nextInt();
		
		
		while(count <= integer ) {
			sum += count++;
//			System.out.println(sum + " " + count);
		}
		
		System.out.printf("The sum of all i, where i runs from 1 to %d equals %d.\n", integer, sum);
		
		input.close();
	}
}