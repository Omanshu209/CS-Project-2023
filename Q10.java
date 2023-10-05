/*
Question 10

 -----------------------------------------------------
|Cource Code |   Cource Name  | Cource Charge(per day)|
|                                                     |
|    101     | Stone Painting |        160            |
|    102     |     Origami    |        125            |
|    201     |  Bag Painting  |        250            |
 -----------------------------------------------------
 
W.A.P to take the cource code and number of days a student wants to enroll as input and display the cource code, cource name and the amount to be paid.
*/

import java.util.Scanner;

public class Q10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Cource Code : ");
		int courceCode = sc.nextInt();
		
		System.out.print("Enter the number of days you want to enroll : ");
		int numOfDays = sc.nextInt();
		
		switch(courceCode)
		{
			case 101:
				System.out.println(
				"\nCource Code : 101" +
				"\nCource Name : Stone Painting" +
				"\nAmount to be paid : " + (numOfDays * 160)
				);
				break;
				
			case 102:
				System.out.println(
				"\nCource Code : 102" +
				"\nCource Name : Origami" +
				"\nAmount to be paid : " + (numOfDays * 125)
				);
				break;
			
			case 201:
				System.out.println(
				"\nCource Code : 201" +
				"\nCource Name : Bag Painting" +
				"\nAmount to be paid : " + (numOfDays * 250)
				);
				break;
				
			default:
				System.out.println("\nInvalid Cource Code <" + courceCode + ">");
				break;
		}
	}
}
