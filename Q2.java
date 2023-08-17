/*
Question 2

W.A.P. to take a number as input from the user and check if it is trimorphic or not.
[A number is said to be trimorphic if the cube of the number ends in the number itself]
*/

import java.util.Scanner;

public class Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double num = sc.nextInt(), cube = Math.pow(num, 3);
		int divider = 1;
		
		while(num > 0)
		{
			divider *= 10;
			num = Math.floor(num / 10);
		}
		
		if(Math.cbrt(cube) == cube % divider)
		System.out.println("It is a trimorphic number!");
		
		else
		System.out.println("It is not a trimorphic number!");
	}
}