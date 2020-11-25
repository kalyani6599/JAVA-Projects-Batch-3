/*
 * @author A K
 */
package com.cg.training.lab6.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.bean.Person;

public class AgeTester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer,Person> agelist=new HashMap<>();
		List<Integer> id=voterList(agelist);
		System.out.println("---------------------");
		System.out.println("List of Persons id that Eligible for voting-:");
		for(Integer id1:id) {
			System.out.println(id1);
		}
	}
	private static List<Integer> voterList(Map<Integer, Person> agelist) {
		//age=new HashMap<>();
		List<Integer> list=new ArrayList<>();

		Person p1=new Person();
		
		while(true) {
			int i=0;
			System.out.println("Enter the id & age of person:"+(i+1));

			int pid=sc.nextInt();
			int age=sc.nextInt();
			sc.nextLine();
			
			p1.setId(pid);
			p1.setPersonAge(age);

			if(p1.getPersonAge()>18) {
			agelist.put(p1.getId(), p1);
			}

			System.out.println("Do you want to continue(yes/no)");
			String ch=sc.nextLine();
			if(!ch.equalsIgnoreCase("yes")) {
				break;
			}
			
		}

		for(Map.Entry<Integer, Person> l:agelist.entrySet()) {
			list.add(l.getKey());
		}
		return list;
	}

}