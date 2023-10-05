/*
Question 6

W.A.P. to take the 3 sides of a triangle as input from the user. Display whether it is an equilateral, isosceles or scalene. Also check if it is a right-angled triangle.
*/

import java.util.Scanner;

public class Q06
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sides of a triangle\n");
		
		System.out.print("Side 1 : ");
		double side1 = sc.nextInt();
		System.out.print("Side 2 : ");
		double side2 = sc.nextInt();
		System.out.print("Side 3 : ");
		double side3 = sc.nextInt();
		
		System.out.println();
		
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
		{
			System.out.println("The triangle is possible!");
			
			if(side1 == side2 && side2 == side3 && side1 == side3)
				System.out.println("It is an equilateral triangle!");
			
			else if(side1 == side2 || side2 == side3 || side1 == side3)
				System.out.println("It is an isosceles triangle!");
			
			else
				System.out.println("It is a scalene triangle!");
			
			if(Math.sqrt(side1 * side1 + side2 * side2) == side3 || Math.sqrt(side2 * side2 + side3 * side3) == side1 || Math.sqrt(side1 * side1 + side3 * side3) == side2)
				System.out.println("It is a right angled triangle!");
		}
		
		else
			System.out.println("The triangle is not possible!");
	}
}
