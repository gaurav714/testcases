package com.stackroute.demo;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args)
	{
		System.out.println("enter 1st number ");
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		int num=a,num2=a,rem=0,pal=0,add=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			pal=(pal*10)+rem;
			num=num/10;
		}
		if(pal==a)
		{
			while(num2>0)
			{
				add=num2%10;
				if(add%2==0)
				{
					sum=sum+add;
				}
				num2=num2/10;
			}
			if(sum>25)
			{
				System.out.println(a+" is palindrome and sum of even number is greater than 25");
			}
			else 
			{
				System.out.println(a+" is palindrome and sum of even number is not greater than 25");
			}
		}
		else
			System.out.println(a+" is not a palindrome ");
		
	}

	public Object func(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
