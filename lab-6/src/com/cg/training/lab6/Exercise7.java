package com.cg.training.lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {

	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList=new ArrayList<>();
		int size=sc.nextInt();
		Integer [] arr=new Integer[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			arrayList.add(arr[i]);
		}
		sc.close();
		System.out.println(arrayList);
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
				

	}

}
