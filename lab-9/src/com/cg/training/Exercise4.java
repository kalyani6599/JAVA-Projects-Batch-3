package com.cg.training;

import java.util.Scanner;

interface Student{
	String getName();
	
}

public class Exercise4 {
	
	private static Scanner scanner=new Scanner(System.in);
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) 
	{
		System.out.println("Enter name:");
		String name = scanner.nextLine();
		
		
		Exercise4  ex4 = new Exercise4 (); 
		
		ex4.setName(name);
		Student emp = ex4::getName;
	    System.out.print("Student Name is : ");
	    System.out.print(emp.getName());
	    
	}
}