/*
* This program prompts 
* @author {user}
* Course: COMP B11
* Created: Apr. 18, 2018
* Source File: ProgramExamArrayMethodsPractice.java
*/
import java.util.Arrays;

public class ProgramExamArrayMethodsPractice {
	public static void main(String[] args) {
	
		double[] anArray = { 1.2, 3.4, 5.6, 7.8, 9.10 };
		processArray(anArray, 2.0);
		System.out.println(Arrays.toString(anArray));
		}
	
	/**
	 * This method will check if an element resides in index that is EVEN or ODD
	 * if EVEN then will multiple the element by doubleGiven value, else ODD then
	 * the element at the given index will divided by doubleGiven. Then will put
	 * the value of the element back into the array and will return the array.
	 * 
	 * @param array The array received when the method is called
	 * @param doubleGiven the double given by the to be used in the method
	 * @return The new array with its changed elements.
	 */
	public static double[] processArray(double[] array, double doubleGiven) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] *= doubleGiven; 
			}
			else {
				array[i] /= doubleGiven;
			}
		}
		return array;
	}

}