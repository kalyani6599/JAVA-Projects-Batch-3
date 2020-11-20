package com.capgemini.lab1;

public class Exercise1 {
	
	public double Cube(int n) {
		return Math.pow((n*(n+1)/2), 2);
		
	}

	public static void main(String[] args) {
		
		Exercise1 e=new Exercise1();
		double result= e.Cube(5);
		System.out.println("Result:="+result);

	}

}
