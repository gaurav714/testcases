package com.stackroute.demo;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args)
	{
	System.out.println("enter number ");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	if (num%2!=0 && num>=20 && num<=30)
	{
		System.out.println("Tom");
	}
	else if (num%2==0 && num>=20 && num<=30)
	{
		System.out.println("Jerry");
	}
	else
			System.out.println("condition not satisfied");
	}
}
	
