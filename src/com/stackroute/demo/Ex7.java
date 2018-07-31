package com.stackroute.demo;

import java.util.Scanner;
import java.util.Vector;

public class Ex7 {
	public static void main(String[] args)
	{
		int rem=0,pal=0,count=0;
		System.out.println("enter a number ");
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		
		
		int num=a,num2=a,count2=0,rem2=0,j=0,tem,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			count=count+1;
			num=num/10;
		}
		int arr[]=new int[count];
		
		
		while(num2>0)
		{
			rem2=num2%10;
			arr[j]=rem2;
			count2=count2+1;
			num2=num2/10;
			j=j+1;
		}
		
		
		for(int i=0;i<count;i++)
		{
			for(int k=i+1;j<count;j++)
			{
				if(arr[i]<arr[j])
				{
					tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]);
		}
		for(int i=0;i<count;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		if(sum>15)
		{
			System.out.println("sum of even number "+sum);
		}
		else
		{
			System.out.println("sum of even number "+sum);
			System.out.println("false");
		}
	}
}
