/*
Question 3

W.A.P. to print all the Armstrong numbers between 1 and 500.
[A number is Armstrong if the sum of the cubes of each digit of the number is equal to the number itself]
*/

public class Q3
{
	static boolean checkArmstrong(double num)
	{
		int sum = 0;
		double originalNum = num;
		
		while(num > 0)
		{
			sum += Math.pow(num % 10, 3);
			num = Math.floor(num / 10);
		}
		
		if(sum == originalNum)
		return true;
		
		else
		return false;
	}
	
	public static void main(String args[])
	{
		System.out.println("All the Armstrong numbers between 1 and 500 are as follows :\n");
		
		for(int i = 1;i <= 500;i++)
		{
			if(checkArmstrong(i))
			System.out.println(i);
		}
	}
}