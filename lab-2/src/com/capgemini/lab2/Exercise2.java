package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;


public class Exercise2 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// accept the no of string object
		int size=sc.nextInt();
		sc.nextLine();
		
		//allocate memory
		String arr[]=new String[size];
		
		//Enter the object in a string array
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+(i+1)+" object----");
			arr[i]=sc.nextLine();
		}
		System.out.println("Output:-\n");
		sortStrings(arr);
		


	}
	private static String sortStrings(String a[]) {
		int mid=0;
		Arrays.sort(a);
		if(a.length%2==0)
			mid=a.length/2;
		else 
			mid=(a.length/2)+1;
		for (int j = 0; j < a.length; j++) {
			
			if(j<mid)
				System.out.println(a[j].toUpperCase());
				else
				System.out.println(a[j].toLowerCase());
			
		}
		return null;
			
		}

}
