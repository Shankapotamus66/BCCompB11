/*
* This program prompts the user to input a radius for a sphere and computes and displays the volume of sphere with a given radius by the user.
*
* @author {user}
* Course: COMP B11
* Created: Jan 29, 2017
* Source File: SphereVolumeInput.java
*/
import java.util.Scanner;

public class SphereVolumeInput {
	public static void main(String[] args) {
		double radius = 10;
		double volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		
		volume = Math.PI*(4.0/3.0)*radius*radius*radius;
		
		System.out.println(volume);
	
		input.close();
	}
}