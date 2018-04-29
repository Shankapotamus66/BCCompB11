/*
* This program prompts the user to input a radius for a sphere and computes and displays the volume of sphere with a given radius by the user.
*
* @author {user}
* Course: COMP B11
* Created: Jan 31, 2017
* Source File: SphereVolumeInputPrintf.java
*/
import java.util.Scanner;

public class SphereVolumeInputPrintf {
	public static void main(String[] args) {
		double radius = 10;
		double volume;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		
		volume = Math.PI*(4.0/3.0)*radius*radius*radius;
		
		System.out.printf("The volume of a sphere\nwith radius %.4f is %.4f.\n", radius, volume);

		input.close();
	}
}