package com.stackroute.demo;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args)
	{
		int correct=0;
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
		while(correct!=1)
		{
			System.out.println("guess a number ");
			int a=sc.nextInt();
			if(a==n)
			{
				System.out.println("you guessed correct number");
				correct=1;
			}
			else if(a>n)
			{
				System.out.println("guess is greater than the number");
			}
			else
			{
				System.out.println("guess is smaller than the number");
			}
		}

	}
}