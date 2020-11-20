package com.capgemini.lab5;

import java.util.Scanner;

public class AgeClass {

	public static void main(String[] args) throws AgevalidException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:=");
		int age=sc.nextInt();
		sc.close();
		
		if(age<15)
		{
			throw new AgevalidException("Age is not valid");
		}
		
		System.out.println(age+" Age is valid");

	}

}
