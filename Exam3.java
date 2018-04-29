/*
* This program 
*
* @author {user}
* Course: COMP B11
* Created: Mar 6, 2018
* Source File: Exam3.java
*/
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		int int1, int2, int3;
		int sumInt1and3, sumInt2and3, wordLength;
		double double1, double2, double3;
		double sumDouble;
		String word1, word2, word3;
		
		System.out.print("Enter, in order, a word, an integer, a double,\n"
				+ "an integer, a double, an integer, a double, and two words\n");
		word1 = input.next();
		int1 = input.nextInt();
		double1 = input.nextDouble();
		int2 = input.nextInt();
		double2 = input.nextDouble();
		int3 = input.nextInt();
		double3 = input.nextDouble();
		word2 = input.next();
		word3 = input.next();
		
		sumInt1and3 = int1 + int3;
		sumInt2and3 = int2 + int3;
		sumDouble = int1 + int2 + double1;
		wordLength = word1.length();
		
		if (sumInt1and3 > 10 && wordLength > 10)
		{
			System.out.printf("%.1f%s%s%s\n", double3, word1, word2, word3);
		}
		else if (double2 < 8.8 || word1.equals(word2))
		{
			System.out.printf("%d,%f,%s\n%s\n", sumInt2and3, sumDouble, word2, word3);
		}
		else
		{
			System.out.printf("Farewell %s\n", word3);
		}
				
		input.close();
	}
}