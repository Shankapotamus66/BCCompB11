/*
* This program prompts the user to enter a word, then reads the word, then the program prompts the user to
* enter an index into the word then will read the index. The program will then find the letter at the index 
* and display the letter.
*
* @author {user}
* Course: COMP B11
* Created: Feb 6, 2017
* Source File: LetterAt.java
*/
import java.util.Scanner;

public class LetterAt {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int index;
		char letter;
		String word;
		int length;
		
		System.out.print("Enter a word: ");
		word = input.next();
		length = word.length();
		
		System.out.print("Enter index: ");
		index = input.nextInt();
		
     	if (index <= length -1)
		{
			letter = word.charAt(index);
			System.out.printf("In word \"%s\", the letter at index %d is '%c'.\n", word, index, letter);
		}
		else
		{
			System.out.printf("%d is not a legal index for \"%s\".\n", index, word);
		}
     	
     	input.close();
	}
}