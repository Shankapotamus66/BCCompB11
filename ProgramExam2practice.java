/*
* This program prompts the user to enter two shorter lengths of a right triangle 
* and will compute the the hypotenuse of the triangle rounding all values to the 
* sixth deciaml place.
*
* @author {user}
* Course: COMP B11
* Created: Feb 11, 2017
* Source File: ProgramExam2practice.java
*/
import java.util.Scanner;

public class ProgramExam2practice {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		double side1;
		double side2;
		double hypotenuse;
		
		System.out.print("Enter the length of the two shorter sides of a right triangle\n");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		
		hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
		
		System.out.printf("If the two short sides of a right triangle have\n"
				+ "lengths %.6f and %.6f, the hypotenuse is %.6f.\n", side1, side2, hypotenuse);
	
		input.close();
	}
}