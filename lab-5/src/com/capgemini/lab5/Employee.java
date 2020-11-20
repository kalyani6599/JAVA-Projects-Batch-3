package com.capgemini.lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	public static void main(String[] args) throws EmployeeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary of employee:=");
		int salary=sc.nextInt();
		sc.close();
		
		if(salary<3000)
		{
			throw new EmployeeException("salary is not valid because it is less than 3000 ");
		}
		
		System.out.println(salary+" salary is valid greater than 3000");

	}

}
