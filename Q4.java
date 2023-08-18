/*
Question 4

W.A.P. to make a game!

Theme : Match Sticks

Rules :
	-> There are 51 match sticks
	-> The user can pick 1 to 4 match sticks in each turn after which the computer does its picking(The computer should pick match sticks such that the total match sticks picked in each turn is 5)
	-> Whoever is forced to pick the last match stick loses the game(Technically the computer will always win)
*/

import java.util.Scanner;

public class Q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int userInput = 0, matchSticksLeft = 51;
		
		System.out.println(
		"--------------------\n" + 
		"CHOOSE YOUR MATCH STICK!!!!!\n" + 
		"--------------------\n\n" +
		"RULES :\n" + 
		"\t-> There are 51 match sticks\n" + 
		"\t-> Pick 1 to 4 match sticks in each turn after which the computer does its picking\n" + 
		"\t-> Whoever is forced to pick the last match stick loses the game\n\n" + 
		"--------------------\n"
		);
		
		while(matchSticksLeft > 0)
		{
			while(!(userInput >= 1 && userInput <= 4))
			{
				System.out.print("How many match stick(s) will you pick? ");
				userInput = sc.nextInt();
			}
			
			matchSticksLeft -= 5;
			
			if(matchSticksLeft <= 0)
			break;
			
			System.out.println(
			"Computer picked " + (5 - userInput) + " match stick(s)!\n" + 
			"Match sticks left : " + (matchSticksLeft) + "\n"
			);
			
			userInput = 0;//reassigned to 0 so that the condition of the nested while loop turns false
		}
		
		System.out.println(
		"\n--------------------\n" + 
		"YOU LOSE!\n" + 
		"--------------------"
		);
	}
}