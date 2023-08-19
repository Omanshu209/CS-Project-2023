/*
Question 18

W.A.P to display the factorial of all the numbers between m and n. Take the input of m and n from the user.
*/

import java.util.Scanner;

public class Q18
{
	static int factorial(int num)
	{
		int FACTORIAL = 1;
		while(num > 0)
		{
			FACTORIAL *= num;
			num--;
		}
		return FACTORIAL;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of m : ");
		int m = sc.nextInt();
		
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for(;m <= n;m++)
		System.out.println(m + "! = " + factorial(m));
	}
}