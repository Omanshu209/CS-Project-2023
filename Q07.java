/*
Question 7

W.A.P to take a character as input from the user and determine whether it is a capital letter, small case letter, digit or a special symbol using its ASCII value
*/

import java.util.Scanner;

public class Q07
{
	static String determineChar(char character)
	{
		int ASCII = (int)character;
		
		if(ASCII >= 65 && ASCII <= 90)
		return(character + " is a capital letter");
		
		else if(ASCII >= 97 && ASCII <= 122)
		return(character + " is a small case letter");
		
		else if(ASCII >= 48 && ASCII <= 57)
		return(character + " is a number(digit)");
		
		else
		return(character + " is a special symbol");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character : ");
		char character = sc.next().charAt(0);
		
		System.out.println(determineChar(character));
	}
}
