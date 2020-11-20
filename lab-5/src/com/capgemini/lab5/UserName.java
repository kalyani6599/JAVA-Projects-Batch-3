package com.capgemini.lab5;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name:=");
		String fname=sc.nextLine();
		System.out.println("Enter last Name:=");
		String lname=sc.nextLine();
		sc.close();
		try {
			if(fname=="" && lname=="")
			{
				throw new NameNotValidException("Name is not valid");
			}
			System.out.println("Name is valid----"+fname+" "+lname);
		}catch (NameNotValidException e) {
			e.printStackTrace();
		}

	}

}
