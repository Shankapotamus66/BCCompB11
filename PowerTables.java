/*
* This program 
*
* @author {user}
* Course: COMP B11
* Created: Mar 7, 2018
* Source File: PowerTables.java
*/
//import java.util.Scanner;

public class PowerTables {
	public static void main(String[] args) {
	
		int base = 3;
		for(base = 1; base <= 10; ++base) {
		for(int power = 1; power <= 4; power++)
			System.out.printf("%6.0f ", Math.pow(base, power));
			System.out.println();
		}
	}
}