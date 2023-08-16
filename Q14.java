/*
Question 14

W.A.P. to take a number as an input from the user and check if it is a Nest Number or not!
[A nest number is a number which contains at least one digit which is zero]
*/

import java.util.Scanner;

public class Q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean nestNumber = false;
		
		System.out.print("Enter a number : ");
		double num = sc.nextDouble();
		
		while(num >= 10)
		{
			if(num % 10 == 0)
			{
				nestNumber = true;
				break;
			}
			num = Math.floor(num / 10);
		}
		
		if(nestNumber)
		System.out.println("It is a nest number!");
		
		else
		System.out.println("It is not a nest number!");
	}
}