/*
Question 19

W.A.P. to take the marks of 40 students in maths, science and english as input.

Print the following :
	-> The number of students who secured >= 95% in all the three subjects.
	-> The number of students who secured >= 90% in Maths, Science and English.
*/

import java.util.Scanner;

public class Q19
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double maths, science, english;
		int highScorers = 0, highMathsScorers = 0, highScienceScorers = 0, highEnglishScorers = 0;
		
		System.out.println(
		"--------------------\n" +
		"ICSE Examination Marks 2014\n" +
		"--------------------\n"
		);
		
		for(int i = 1;i <= 40;i++)
		{
			System.out.println("Student "  + i);
			
			System.out.print("\tMaths : ");
			maths = sc.nextDouble();
			
			System.out.print("\tScience : ");
			science = sc.nextDouble();
			
			System.out.print("\tEnglish : ");
			english = sc.nextDouble();
			
			if(maths >= 95 && science >= 95 && english >= 95)
				highScorers++;
			
			if(maths >= 90)
				highMathsScorers++;
			
			if(science >= 90)
				highScienceScorers++;
			
			if(english >= 90)
				highEnglishScorers++;
			
			System.out.println();
		}
		
		System.out.println(
		"--------------------\n" +
		"Students who scored 95% or more in all subjects : " + highScorers + "\n\n" +
		"Students who secured 90% or more in :\n" +
		"\tMaths : " + highMathsScorers + "\n" +
		"\tScience : " + highScienceScorers + "\n" +
		"\tEnglish : " + highEnglishScorers + "\n" +
		"--------------------"
		);
	}
}
