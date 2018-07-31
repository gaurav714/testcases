package com.stackroute.demo;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args)
	{
		System.out.println("enter string of numbers ");
		Scanner sc = new Scanner (System.in);
		String word=sc.nextLine();
		String[] split	= word.split(" ");
		int sum=0;
		int len=split.length;
		for(int i=0;i<len;i++)
		{
			sum=sum+(Integer.parseInt(split[i]));
		}
		System.out.println(sum);
	}
}