package com.JavaConditionalStatements;

public class Example6 
{

	public static void main(String[] args)
	{

		int age = 1;
		
		if(age >= 60)
		{
			System.out.println("Senior Adult");
		}
		
		else if(age < 59 && age > 40)
		{
			System.out.println("MiddleAge Adult");
		}
		
		else if(age < 39 && age > 20)
		{
			System.out.println("Adult");
		}
		
		else if(age < 19 && age >13)
		{
			System.out.println("Teen");
		}
		
		else if(age < 12 && age > 5)
		{
			System.out.println("Child");
		}
		
		else if(age == 2)
		{
			System.out.println("Toddler");
		}
		
		else
		{
			System.out.println("Infant");

		}
		
	
		
	}

}
