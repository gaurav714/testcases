package com.stackroute.demo;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args)
	{
	char a;
	System.out.println("enter word ");
	Scanner sc = new Scanner (System.in);
	String word=sc.next();
	int len=word.length();
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(word.charAt(i));
	}
	}
	

}
