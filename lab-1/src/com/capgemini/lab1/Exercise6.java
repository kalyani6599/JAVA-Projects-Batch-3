package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise6 {
	
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sc.nextInt();
		int res= calculateDifference(n);
		System.out.println("Ans----"+res);
	}

	private static int calculateDifference(int no) {
		
		
			int sum1=(int) Math.pow(no*(no+1)/2, 2);
			
			int sum2=(int)(no*(no+1*((2*no)+1))/6);
			
			return sum2+sum1;
				
		 
		// TODO Auto-generated method stub
		
	}
}
