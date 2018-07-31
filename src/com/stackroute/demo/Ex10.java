package com.stackroute.demo;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args)
	{
		System.out.println("enter a string ");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println("enter a number ");
		int num=scn.nextInt();
		int len = str.length();
		System.out.print(str);
		for(int i=1;i<=num;i++)
		{
			System.out.print(str.substring(len-num, len));
		}
		
	}

}
