/*
Question 11

W.A.P. to take a numerical input from the user and verify whether it is a Cyclo number or not!
[A Cyclo number is a number whose first digit is equal to its last digit]
*/

import java.util.Scanner;

public class Q11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double num = sc.nextDouble(), firstDigit = num % 10;
		
		while(num >= 10)
		num = Math.floor(num / 10);
		
		if(firstDigit == num)
		System.out.println("It is a cyclo number!");
		
		else
		System.out.println("It is not a cyclo number!");
	}
}