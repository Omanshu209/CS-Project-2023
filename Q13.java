/*
Question 13

 ---------------------------------------------
|  Purchase Amount  | Discount |   Gift       |
|                   |          |              |
|      < 1100       |    5%    | A Wallet     |
| >= 1100 && < 5100 |   10%    | A Wrist Watch|
| >= 5100 && < 10100|   15%    | A Wall Clock |
|     >= 10100      |   20%    | A Travel Kit |
 ---------------------------------------------
 
W.A.P. to take the amount of purchase as input from the customer. Print the amount payable and the gift the customer should get.
*/

import java.util.Scanner;

public class Q13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of purchase : ");
		int purchaseAmount = sc.nextInt();
		
		System.out.println();
		
		if(purchaseAmount < 1100)
			System.out.println(
			"Amount to be paid : " + (purchaseAmount - 5.0/100.0 * purchaseAmount) + "\n" +
			"Gift : A Wallet"
			);
		
		else if(purchaseAmount >= 1100 && purchaseAmount < 5100)
			System.out.println(
			"Amount to be paid : " + (purchaseAmount - 10.0/100.0 * purchaseAmount) + "\n" +
			"Gift : A Wrist Watch"
			);
		
		else if(purchaseAmount >= 5100 && purchaseAmount < 10100)
			System.out.println(
			"Amount to be paid : " + (purchaseAmount - 15.0/100.0 * purchaseAmount) + "\n" +
			"Gift : A Wall Clock"
			);
		
		else
			System.out.println(
			"Amount to be paid : " + (purchaseAmount - 20.0/100.0 * purchaseAmount) + "\n" +
			"Gift : A Travel Kit"
			);
	}
}
