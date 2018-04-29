/*
* This program prompts the user to enter a line of text and then enter a beginning and ending index value 
* and will display the text/string that is in those index values.
*
* @author {user}
* Course: COMP B11
* Created: Feb 11, 2017
* Source File: ProgramExam2practiceSubstring.java
*/
import java.util.Scanner;

public class ProgramExam2practiceSubstring {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		String line;
		int indexStart;
		int indexEnd;
		
		System.out.print("Enter a line:\n");
		line = input.nextLine();
		
		System.out.print("Enter first and last index of desired substring\n");
		indexStart = input.nextInt();
		indexEnd = input.nextInt();
		
		String substring = line.substring(indexStart, indexEnd + 1);
		
		System.out.printf("The characters from %d to %d are \"%s\"\n",
				indexStart, indexEnd, substring);
		
		input.close();
	}
}