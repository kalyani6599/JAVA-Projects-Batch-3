package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a number : ");
	      int num = scanner.nextInt();
	      scanner.close();
		boolean res=checkNumber(num);
		if(res == false)
			System.out.println(num+" Digits are not in increasing order.");
		else
			System.out.println(num+" Digits are in increasing order.");
	}

	private static boolean checkNumber(int num) {

	       boolean flag = false;
	        
	       int currentDigit = num % 10;
	       num = num/10;
	        
	       while(num>0)
	       {
	          
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	        
	       if(flag){
	           return false ;
	       }else{
	           return true;
	       }
		
	}

}
