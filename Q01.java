/*
Question 1

W.A.P. (menu driven) which performs the following tasks :

	- Finds the factorial of a number
	- Checks if a number is prime or not
	- Checks if a number is odd or even
	- Exits the program
	
Once the operation is performed, the menu should reappear until the user selects the 4th option
*/

import java.util.Scanner;

public class Q01
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
	
	static String PrimeOrNot(int num)
	{
		int FACTORS = 0;
		
		for(int i = num;i > 0;i--)
		{
			if(num % i == 0)
			FACTORS++;
		}
		
		if(FACTORS > 2)
			return(num + " is not a prime number");
		
		else
			return(num + " is a prime number");
	}
	
	static String OddOrEven(int num)
	{
		if(num % 2 == 0)
			return(num + " is an even number");
		
		else
			return(num + " is an odd number");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int OPTION = 0, NUM = 0;
		String menu = "MENU : \n\n\t1 - Find the factorial of a number\n\t2 - Check if a number is prime or not\n\t3 - Check if a number is odd or even\n\t4 - Exit";
		String line = "\n--------------------\n";// for better UI
		
		boolean RUN = true;
		while(RUN)
		{
			System.out.println(menu);
			System.out.println(line);
			
			System.out.print("USER : ");
			OPTION = sc.nextInt();
			
			System.out.println(line);
			
			if(OPTION >= 1 && OPTION <= 3)
			{
				System.out.print("Enter the number : ");
				NUM = sc.nextInt();
			}
			
			System.out.println(line);
			
			switch(OPTION)
			{
				case 1:
					System.out.println("The factorial of " + NUM + " is " + factorial(NUM));
					System.out.println(line);
					break;
					
				case 2:
					System.out.println(PrimeOrNot(NUM));
					System.out.println(line);
					break;
					
				case 3:
					System.out.println(OddOrEven(NUM));
					System.out.println(line);
					break;
				
				case 4:
					RUN = false;
					break;
					
				default:
					System.out.println(OPTION + "is a not a valid option! Please try again");
					break;
			}
		}
	}
}
