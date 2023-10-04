/*
Question 5

W.A.P. to print all the ASCII values and their equivalent characters using a while loop.
*/

public class Q05
{
	public static void main(String[] args)
	{
		System.out.println("The ASCII values and their equivalent characters are as follows :\n");
		
		int i = 0;
		while(i <= 255)
		{
			System.out.println("ASCII Value: " + i + " | Character: " + (char)i + "\n");
			i++;
		}
	}
}
