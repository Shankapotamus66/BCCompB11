/*
* This program prompts 
* @author {user}
* Course: COMP B11
* Created: Apr. 2, 2018
* Source File: Exam4.java
*/
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	
		int tries;
		double estimate;
		
		System.out.println("Enter number of terms to use to estimate PI");
		while (in.hasNextInt()) {
			tries = in.nextInt();
			estimate = estimatePi(tries);
			System.out.printf("With %,d terms:\n"
					+ "     the estimate of PI is %.15f\n", tries, estimate);
			System.out.println("For comparison, Math.PI is " + Math.PI);
		}
		
		in.close();
	}

	/** 
	 * This method computes an estimate of PI by generating random (x,y)'s in the   
	 * positive quadrant of the unit circle and then taking the ratio of the   
	 * number of times (x,y) is within the unit circle to the total number of   
	 * (x,y)'s generated. Multiplying that ratio by 4 gives the estimate of PI.  
	 *   
	 * @param numTries the number of tries to use in estimate  
	 * @return An estimate of PI using numTries  
	 */
	public static double estimatePi(int numTries) {
		double sequence = 0;
		for (int i = 1; i <= numTries; i = i + 2) {
			sequence += ((1.0 / (2.0 * i - 1.0)) - (1.0 / ( 2.0 * i + 1.0)));
		}
		double piEstimate = 4.0 * sequence;
		return piEstimate;
	}
}