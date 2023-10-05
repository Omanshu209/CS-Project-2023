/*
Question 9

 ---------------------------------
|  Days Late  | Late Fine(per day)|
|             |                   |
|   <= 5      |        10         |
|> 5 and <= 10|        15         |
|   > 10      |        30         |
 ---------------------------------
 
Take the number of days a member is late in returning a book as input and print the late fine.
*/

import java.util.Scanner;

public class Q09
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of days late : ");
		int daysLate = sc.nextInt();
		
		if(daysLate <= 5)
			System.out.println("Late fine : " + (daysLate * 10));
		
		else if(daysLate > 5 && daysLate <= 10)
			System.out.println("Late fine : " + (daysLate * 15));
		
		else
			System.out.println("Late fine : " + (daysLate * 30));
	}
}
