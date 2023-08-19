/*
Question 20

W.A.P. to take two numbers as input from the user. Check if they are negative. if not, then check whether they are perfect squares or not.
*/

import java.util.Scanner;

public class Q20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		
		System.out.print("Number 1 : ");
		numbers[0] = sc.nextInt();
		
		System.out.print("Number 2 : ");
		numbers[1] = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0;i <= 1;i++)
		{
			if(numbers[i] < 0)
			System.out.println(numbers[i] + " cannot be a perfect square as it is negative!");
			
			else if(Math.sqrt(numbers[i]) % 1 == 0)
			System.out.println(numbers[i] + " is a perfect square number!");
			
			else
			System.out.println(numbers[i] + " is not a perfect square number!");
		}
	}
}