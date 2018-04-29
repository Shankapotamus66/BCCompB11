/*
* This program prompts the user to enter a word followed by 2 integers, the first integer is smaller than than the second
* then the program will read the word and and the integers and determine if the word length is in the range
* of the given integers. The program will output if the word length is less than / in the range / or greater than the range
* prompted by the user.
*
* @author {user}
* Course: COMP B11
* Created: Mar 12, 2018
* Source File: WordLength.java
*/
import java.util.Scanner;

public class WordLength {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		int intLow, intHigh;
		int wordLength;
		String word;
		
		System.out.print("Enter a word followed by two integers, the first smaller than the second.\n");
		word = input.next();
		intLow = input.nextInt();
		intHigh = input.nextInt();

		wordLength = word.length();
		
		if (wordLength <= intHigh && wordLength >= intLow)
		{
			System.out.printf("The length of \"%s\" is in the range [%d .. %d].\n", word, intLow, intHigh);
		}
		else if (wordLength < intLow)
		{
			System.out.printf("The length of \"%s\" is less than %d.\n", word, intLow);
		}
		else
		{
			System.out.printf("The length of \"%s\" is greater than %d.\n", word, intHigh);
		}
				
		input.close();
	}
}