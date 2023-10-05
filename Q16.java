/*
Question 16

W.A.P. to take time in seconds as input from the user and display the time in minutes and seconds.
*/

import java.util.Scanner;

public class Q16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the time taken in seconds : ");
		int seconds = sc.nextInt(), minutes = 0;
		
		while(seconds >= 60)
		{
			minutes += 1;
			seconds -= 60;
		}
		
		System.out.println("The time taken is " + minutes + " minutes and " + seconds + " seconds");
	}
}
