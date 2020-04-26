package com.mybasics;
import java.util.Scanner;
public class Fabonaci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number: ");
	int n=sc.nextInt();
	Fabonaci obj=new Fabonaci();
	int[] a=obj.cal(n);
	System.out.println();
	System.out.print("The Fabonacci series is: ");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	}
	
	int[] cal(int n)
	{
		int t1=0,t2=1,t3;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=t1;
			t3=t1+t2;
			t1=t2;
			t2=t3;
			
			
		}
		return a;
	}
}
