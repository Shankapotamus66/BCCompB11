/*
* This program prompts the user to enter two integers and will get the sum of
* all integers in the range. 
* @author {user}
* Course: COMP B11
* Created: Apr. 9, 2018
* Source File: SumOfRange.java
*/
import java.util.Scanner;

public class SumOfRange {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	
		int n1, n2, sum;
		
		System.out.println("Enter two intergers");
		n1 = in.nextInt();
		n2 = in.nextInt();
		
		sum = sumOfRange(n1, n2);
		
		System.out.printf("The sum of numbers from %d to %d is %d.\n", n1, n2, sum);
				
		in.close();
	}
	
	/**
	 * This method computes the sum of all the integers in the range from
	 * the lower integer n1 to the greatest integer n2 and will return
	 * the sum.
	 * 
	 * @param n1 the first integer of the range that marks the beginning 
	 * @param n2 the second integer of the range that marks the end
	 * @return The sum of all the numbers in the range
	 */
	public static int sumOfRange(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}
}