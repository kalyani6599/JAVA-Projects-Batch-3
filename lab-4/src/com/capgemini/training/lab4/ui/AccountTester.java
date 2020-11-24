/*
 * 
 * @author A K
 */
package com.capgemini.training.lab4.ui;

import com.capgemini.training.lab4.assignments.Account;
import com.capgemini.training.lab4.assignments.CurrentAccount;
//import com.capgemini.training.lab4.assignments.SavingAccount;

public class AccountTester {

	public static void main(String[] args) {
		
		Account A = new Account("Smith",30,45756987,2000);
		System.out.println(A);
		Account B = new Account("Kathy",35,45896988,3000);
		System.out.println(B);
		A.deposit(2000);
		System.out.println(A);
		B.withdraw(2000);
	System.out.println(B);
		
		CurrentAccount curAcc = new CurrentAccount("Kathy", 22, 789845, 5000,2000);
		System.out.println(curAcc);
		
		curAcc.withdraw(7002);
		System.out.println(curAcc);
		
		
	}

}
