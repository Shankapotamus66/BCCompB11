/*
* This program prompts the user to enter two words and will read the two words and put them into
* a sentence with their concatenation.
*
* @author {user}
* Course: COMP B11
* Created: Feb 11, 2017
* Source File: ProgramExam2.java
*/
import java.util.Scanner;

public class ProgramExam2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		String word1;
		String word2;
		
		System.out.print("Enter two words\n");
		word1 = input.next();
		word2 = input.next();
		
		String concatenation = (word1 + word2);
		
		System.out.printf("%s is the second word and %s is the first word.\n"
				+ "%s is the concatenation of the two words.\n", word2, word1, concatenation);

		input.close();
	}
}