package com.capgemini.lambda.client;

import com.capgemini.lambda.Calculator;

public class CalculateClient {
	
	
	public static void main(String[] args)
	{
		Calculator addition=(x,y) -> x+y;
		System.out.println(addition.calculate(10, 25));
		
		
		Calculator subtraction=(x,y)->x-y;
		System.out.println(subtraction.calculate(10, 25));
	}

}
