package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise4 {
	
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=sc.nextInt();
		
		System.out.println("Prime numbers are-----");
		
		for(int j=2;j<=n;j++)
		{
			int c=0;
			
		for (int i = 1; i <=j; i++) 
		{
			if(j%i==0)
			{
				c++;
			
			   
			}

		}
		if(c==2)
		System.out.println(j+" ");
		
		}
	}

}
