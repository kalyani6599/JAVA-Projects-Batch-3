package com.capgemini.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //Scanner objScanner = new Scanner(System.in);
        System.out.print("\nEnter a Line Of Integers:");
        
        //String line = objScanner.nextLine();
        String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        StringTokenizer st = new StringTokenizer(line);
        System.out.println("\nNumber of tokens : "+st.countTokens());
        long sum = 0;
        System.out.print("\nTokens are : \n" );
        while (st.hasMoreTokens())
        {
            long i = Long.parseLong(st.nextToken());
            System.out.print(i + "\n");
            sum = sum + i;
        }
        System.out.println("\nThe Sum Is :" +sum);
	}

}
