/*
* This program prompts the user to enter a line, then the program reads the line and will pair characters
* and determine if the first character is less than the second character and if so will add one to the value.
*
* @author {user}
* Course: COMP B11
* Created: Mar 14, 2018
* Source File: CountRisingPairs.java
*/
import java.util.Scanner;

public class CountRisingPairs {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		String line;
		int pair = 0;
		int length;
		char first, second;
		
		System.out.print("Enter a line:\n");
		line = input.nextLine();
		
		length = line.length();
		
		for (int index = 1; index < length; index++) {
			first = line.charAt(index - 1);
			second = line.charAt(index);
			
			if (first < second) {
				pair = pair + 1;
			}	
		}
		
		System.out.printf("%d\n", pair);
		
		input.close();
	}
}