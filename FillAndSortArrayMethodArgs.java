/*
* This program will read 3 arguments from a command line; first argument is the desired number
* of random numbers the user want, the second argument is the low end of the range, the third is
* is the high end of the range of random numbers. The program will create an array and fill the 
* array with random numbers between the range using a method. Then will sort the numbers in the
* array. Finally will display the numbers in the array using another method.
* 
* @author {user}
* Course: COMP B11
* Created: Apr 2, 2018
* Source File: FillAndSortArrays.java
*/
import java.util.Random;
import java.util.Arrays;

public class FillAndSortArrayMethodArgs {
	public static void main(String[] args) {
	
		int numRandom = Integer.parseInt(args[0]);
		double low = Double.parseDouble(args[1]);
		double high = Double.parseDouble(args[2]);
		
		double[] array = new double[numRandom];
		
		fillArrayRandom(array, low, high);
		
		Arrays.sort(array);
		
		printArray(array);	
	}
	
	/**
	 * This method fills the array with random numbers in the range from low to high
	 * from the desired numbers inputted by the user.
	 * 
	 * @param array filled with random numbers
	 * @param low the lowest value in the range for the array
	 * @param high the highest value in the range for the array
	 */
	public static void fillArrayRandom(double[] array, double low, double high) {
		Random random = new Random(1234);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * (high - low) + low;
		}
		
	}
	
	/**
	 * This method prints out all elements of the array, one per line.
	 * 
	 * @param array the array thats elements get printed.
	 */
	public static void printArray(double[] array) {
		
		for (double element : array) {
			System.out.printf("%s\n", element);
		}
	}
	
}