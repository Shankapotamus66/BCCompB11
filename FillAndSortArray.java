/*
* This program prompts a user to enter a number of elements in an array and sorts the array
* in a list and prints the elements.
*
* @author {user}
* Course: COMP B11
* Created: Mar 19, 2018
* Source File: FillAndSortArrays.java
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class FillAndSortArray {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Random random = new Random(1234);
		
		int element;
		
		System.out.println("How many elements are in the array? ");
		element = in.nextInt();
		
		double[] array = new double[element];
		
		for (int i = 0; i < element; i++)
		{
			array[i] = random.nextDouble() * 100;
		}
		
		Arrays.sort(array);
		
		for (int i = 0; i < element; i++)
		{
			System.out.printf("%s\n", array[i]);
		//	System.out.println(array[i]); // testing purpose
		}
		
		in.close();
	}
}