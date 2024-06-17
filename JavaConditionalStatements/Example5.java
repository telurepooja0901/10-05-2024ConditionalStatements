package com.JavaConditionalStatements;

public class Example5 {

	public static void main(String[] args) {

		
		int marks = 41;
		
		if(marks <= 100 && marks > 70)
		{
			System.out.println("Distinction");
		}
		else if(marks <= 70 && marks > 60)
		{
			System.out.println("First Class");
		}
		else if(marks <= 60 && marks > 50)
		{
			System.out.println("Second Class");
		}
		else if(marks <= 50 && marks > 40)
		{
			System.out.println("First Class");
		}
		else if(marks == 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail.");
		}
			
		
	}

}
