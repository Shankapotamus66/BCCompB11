/*
* This program
*
* @author {user}
* Course: COMP B11
* Created: Feb 7, 2018
* Source File: Exam3_test.java
*/
import java.util.Scanner;

public class Exam3_test {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		int int1, int2, int3;
		int sumInt1and3, sumInt2and3, wordLength;
		double double1, double2, double3;
		double sumDouble;
		String word1, word2, word3;
		String stringResult;
		
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
		stringResult = word1 + word2 + word3;
		
		if (sumInt1and3 > 10 && wordLength > 10)
		{
			System.out.println(double3 + stringResult);
		}
		else if (double2 < 8.8 || word1.equals(word2))
		{
			System.out.printf("%d,%f,%s\n%s\n", sumInt2and3, sumDouble, word2, word3);
		}
		else
		{
			System.out.println("Farewell " + word3);
		}
		
		System.out.printf("%s first word \n"
				+ "%d first int\n"
				+ "%f first double\n"
				+ "%d second int\n"
				+ "%f second double\n"
				+ "%d third int\n"
				+ "%f third double\n"
				+ "%s %s second and third word\n\n", word1, int1, double1, int2, double2, int3, double3, word2, word3);
		System.out.printf("%d sumInt1and3\n"
				+ "&d sumInt2and3\n"
				+ "%d wordLength\n\n", sumInt1and3, sumInt2and3, wordLength);
				
		input.close();
	}
}