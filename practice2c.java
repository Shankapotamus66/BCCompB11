/*
* This program prompts the user to input a radius for a sphere and computes and displays the volume of sphere with a given radius by the user.
*
* @author {user}
* Course: COMP B11
* Created: Jan 31, 2017
* Source File: SphereVolumeInputPrintf.java
*/
import java.util.Scanner;

public class practice2c {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d = 44;
		boolean b1;
		boolean b2;
		
		System.out.print("Enter integers for a, b, c.\n");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		System.out.print("Enter true/false for b1 and b2.\n");
		b1 = in.nextBoolean();
		b2 = in.nextBoolean();
		
		if (a == b || c == a + b)
		{
			if (b1 && b2)
			{
				d = a + b;
				System.out.printf("Int d = %d\n", d);
			}
			else
			{
				d = a - b;
				System.out.printf("Int d = %d\n", d);
			}
		}
		else if (b1 || a > b)
		{
			if (c >= b && b2)
			{
				d = a * b;
				System.out.printf("Int d = %d\n", d);
			}
		else
		{
			d = 99;
			System.out.printf("Int d = %d\n", d);
		}


		in.close();
		}
	}
}