/*
* This program prompts the user to input a radius for a sphere and computes and displays the volume of sphere with a given radius by the user.
*
* @author {user}
* Course: COMP B11
* Created: Feb 28, 2018
* Source File: While.java
*/
import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int count = 1;
		int integer;
		
		System.out.printf("Enter N: ");
		integer = input.nextInt();
		
		
		while(count <= integer ) {
			sum += count++;
				
		}
		System.out.printf("The sum of all i, where i runs from 1 to %d equals %d.\n", integer, sum);
		input.close();
	}
}