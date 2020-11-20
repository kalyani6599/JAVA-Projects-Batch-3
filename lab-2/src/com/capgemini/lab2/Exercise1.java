package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

//import com.sun.tools.javac.code.Attribute.Array;

public class Exercise1 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//accepts no
		
		System.out.println("Enter the no of array----");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+(i+1)+" element in array--");
			arr[i]=sc.nextInt();
		}
		// call function
		int sec=getSecondSmallest(arr);
		// print second last element 
		System.out.println(sec);
		
		

	}
	private static int getSecondSmallest(int a[]) {
		
		// sort array
			Arrays.sort(a);
			return (a[1]);
		
	}

}
