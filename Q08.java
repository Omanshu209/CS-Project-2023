/*
Question 8

W.A.P. to enter numbers till the user wants. At the end it should display the count of positive, negative and zeroes entered.
*/

import java.util.Scanner;

public class Q08
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String line = "\n--------------------\n";// for better UI
		
		System.out.print("How many numbers will you enter? ");
		int LIMIT = sc.nextInt();
		
		System.out.println(line);
		
		int maxLIMIT = LIMIT, positives = 0, negatives = 0, zeroes = 0, num;
		
		while(LIMIT > 0)
		{
			System.out.print("Number " + (maxLIMIT - LIMIT + 1) + " : ");
			num = sc.nextInt();
			
			if(num > 0)
				positives++;
			
			else if(num < 0)
				negatives++;
			
			else
				zeroes++;
			
			LIMIT--;
		}
		
		System.out.println(line);
		
		System.out.println("Count of positive numbers : " + positives);
		System.out.println("Count of negative numbers : " + negatives);
		System.out.println("Count of zeroes           : " + zeroes);
	}
}
