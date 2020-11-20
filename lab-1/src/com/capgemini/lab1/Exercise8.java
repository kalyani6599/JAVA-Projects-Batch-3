package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise8 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter a no:=");
		int n=sc.nextInt();
		boolean r= checkPower(n);
		
		if(r==true)
			System.out.println(n+" is power of 2");
		else
			System.out.println(n+" is not power of 2");	
		

	}
	private static boolean checkPower(int n) {

		 while(n%2==0)
		 {
			 n=n/2;
		 }
		 if(n==1)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
		
}
