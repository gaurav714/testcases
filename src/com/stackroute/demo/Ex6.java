package com.stackroute.demo;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args)
	{
		System.out.println("enter a char ");
		Scanner sc = new Scanner (System.in);
		String a= sc.next();
		char st=a.charAt(0);
		int asci=st;
		if(asci>=65&&asci<=90)
		{
			System.out.println("capital letter");
		}
		else if(asci>=97&&asci<=122)
		{
			System.out.println("small letter");
		}
		else if(asci>=65&&asci<=90)
		{
			System.out.println("capital letter");
		}
		else if(asci=='1'||asci=='2'||asci=='0'||asci=='3'||asci=='4'||asci=='5'||asci=='6'||asci=='7'||asci=='8'||asci=='9')
		{
			System.out.println("digits");
		}
		else
			System.out.println("special char");
	}

}
