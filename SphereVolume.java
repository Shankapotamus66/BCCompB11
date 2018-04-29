/*
* This program computes and displays the volume of a sphere for a given radius.
*
* @author {user}
* Course: COMP B11
* Created: Jan 24, 2017
* Source File: SphereVolume.java
*/
public class SphereVolume {
	public static void main(String[] args) {
		double radius = 10;
		double volume;
		
		volume = Math.PI*(4.0/3.0)*radius*radius*radius;
		
		System.out.println(volume);
	}
}