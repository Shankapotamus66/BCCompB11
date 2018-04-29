/*
 * This program prompts the user to enter an amount of tries to test for PI estimate,
* and will keep allowing more inputs until Q (or any other non int) is inputed and 
* will end the program. This program will call the estimatePi method to do the 
* calculations for the estimate.
*
* @author {user}
* Course: COMP B11
* Created: Mar 19, 2018
* Source File: PiEstimateMethod.java
*/
import java.util.Scanner;
import java.util.Random;

public class PiEstimateMethod {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	
		Random random = new Random(1234);
		int tries;
		double estimate;
		
		System.out.println("Enter number of tries (Q to quit):");
		while (in.hasNextInt()) {
			tries = in.nextInt();
			estimate = estimatePi(tries, random);
			System.out.printf("With %,d tries, your estimate of PI is %.6f\n", tries, estimate);
		}
		
		System.out.println("BYE");
		
		in.close();
	}

	/** 
	 * This method computes an estimate of PI by generating random (x,y)'s in the   
	 * positive quadrant of the unit circle and then taking the ratio of the   
	 * number of times (x,y) is within the unit circle to the total number of   
	 * (x,y)'s generated. Multiplying that ratio by 4 gives the estimate of PI.  
	 *   
	 * @param numTries the number of tries to use in estimate  
	 * @param random the Random object with which to generate random doubles  
	 * @return An estimate of PI using numTries  
	 */
	public static double estimatePi(int numTries, Random random) {
		int hits = 0;
		for (int i = 1; i <= numTries; i++) {
			double x = random.nextDouble();
			double y = random.nextDouble();
			if (x * x + y * y <= 1) {
				hits++;
			}
		}
		double piEstimate = 4.0 * hits / numTries;
		
		return piEstimate;
	}
}