/*
Question 12

Using menu driven program perform the following:

	1) Print the sum of the following series
		1 + (1/2) + (1/3) + (1/4) + (1/5) + ........ (1/n)
		
	2) Print the sum of the following series
		1 + (1/2) + 3 + (1/4) + 5 + (1/6) + ........ n
*/

import java.util.Scanner;

public class Q12
{
	static double Operation1(int n)
	{
		double sum = 0;
		
		for(int i = 1;i <= n;i++)
			sum += 1.0/i;
		
		return sum;
	}
	
	static double Operation2(int n)
	{
		double sum = 0;
		
		for(int i = 1;i <= n;i++)
		{
			if(i % 2 == 0)
				sum += 1.0/i;
			
			else
				sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(
		"Choose 1 of the following operations :\n" +
		"\t1) 1 + (1/2) + (1/3) + (1/4) + (1/5) + ........ (1/n)\n" +
		"\t2) 1 + (1/2) + 3 + (1/4) + 5 + (1/6) + ........ n\n"
		);
		
		System.out.print("Operation Number : ");
		int operation = sc.nextInt();
		
		switch(operation)
		{
			case 1:
				System.out.print("Enter the value of n : ");
				System.out.println("Answer : " + Operation1(sc.nextInt()));
				break;
				
			case 2:
				System.out.print("Enter the value of n : ");
				System.out.println("Answer : " + Operation2(sc.nextInt()));
				break;
				
			default:
				System.out.println("Invalid input <" + operation + ">");
				break;
		}
	}
}
