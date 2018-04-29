/**
* This program copies the first element of the column in a 2D Array and places it
* in the last elements position. Then shifts all other elements down an element.
*
* @author 		{user}
* Course:		COMP B11
* Created:		Apr 8, 2018
* Source File:	Array2dShift.java 
*/
public class Array2dShift {
	public static void shiftArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			int temp = array[row][0];
			for (int col = 1; col < array[row].length; col++) {
				array[row][col - 1] = array[row][col];
			}
			array[row][array[row].length - 1] = temp;	
		}   
	}
}
