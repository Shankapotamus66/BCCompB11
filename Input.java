/*
* This program computes and displays the volume of a sphere for a given radius.
*
* @author {user}
* Course: COMP B11
* Created: Jan 24, 2017
* Source File: SphereVolume.java
*/
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		double radius;
		int integer;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		System.out.print("Enter an integer: ");
		integer = input.nextInt();
		// System.out.print("radius: ");
		System.out.printf("radius=%10f\nintger=%d\n", radius, integer);
		// System.out.println(radius);
		// System.out.print("integer: ");
		// System.out.println(integer);
	
		input.close();
	}
}