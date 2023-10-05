/*
Question 15

W.A.P. to take a number as an input from the user and check if it is a Lead Number or not!
[A number is said to be a lead number if the sum of its even digits is equal to the sum of its odd digits]
*/

import java.util.Scanner;

public class Q15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sumOfOddDigits = 0, sumOfEvenDigits = 0;
		
		System.out.print("Enter a number : ");
		double num = sc.nextDouble();
		
		while(num > 0)
		{
			if(num % 2 == 0)
				sumOfEvenDigits += num % 10;
			
			else
				sumOfOddDigits += num % 10;
			
			num = Math.floor(num / 10);
		}
		
		if(sumOfOddDigits == sumOfEvenDigits)
			System.out.println("It is a lead number!");
		
		else
			System.out.println("It is not a lead number!");
	}
}
