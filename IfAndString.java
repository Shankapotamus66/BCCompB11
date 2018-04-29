/*
* Description
*
* @author {user}
* Course: COMP B11
* Created: Feb 6, 2017
* Source File: IfAndString.java
*/
import java.util.Scanner;

public class IfAndString {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word;
		char firstLetter;
		word = input.next();
	
		firstLetter = word.charAt(0);
		
		if (firstLetter == 'a')
		{
			System.out.printf("\"%s\" starts with an 'a'.\n", word);
		}
		else
		{
			System.out.printf("\"%s\" does not start with an 'a'.\n", word);
		}
		
		input.close();
	}
}