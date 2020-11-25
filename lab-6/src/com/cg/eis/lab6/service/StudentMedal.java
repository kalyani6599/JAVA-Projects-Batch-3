package com.cg.eis.lab6.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.lab6.bean.Medal;
import com.cg.eis.lab6.bean.Student;
public class StudentMedal {

	public static void main(String[] args) {
		Map<Integer,Student> studList=new HashMap<>();
		getdetails(studList);
		showDetails(studList);

	}

	private static void getdetails(Map<Integer, Student> studList) {
		Scanner sc=new Scanner(System.in);		
			Student s=new Student();
				System.out.println("Enter the name,rollno,marks of student 1:");
				String name=sc.nextLine();
				int Roll=sc.nextInt();
				int mk=sc.nextInt();
				sc.nextLine();
				s.setName(name);s.setRollNo(Roll);s.setMarks(mk);
				
				if(s.getMarks()>=90) {
					s.setMedal(Medal.GOLD);
				}else if(s.getMarks()>=80 && s.getMarks()<90) {
					s.setMedal(Medal.SILVER);
				}else if(s.getMarks()>=70 && s.getMarks()<80) {
					s.setMedal(Medal.BRONZE);
				}else {
					s.setMedal(Medal.NOTAPPLICABLE);
				 System.out.println("Not applicable for scholorship");
				}
				studList.put(s.getRollNo(), s);		
		sc.close();
		
	}

	private static void showDetails(Map<Integer, Student> studList) {
		// TODO Auto-generated method stub
		
		for (Map.Entry<Integer, Student> list : studList.entrySet())
		{
			System.out.println(list.getKey()+" "+list.getValue());
		}
		
	}

}




