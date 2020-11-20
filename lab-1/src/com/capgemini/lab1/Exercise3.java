package com.capgemini.lab1;

public class Exercise3 {
	
	public int a=1,b=1;
	public static int a1=1,b1=1;
	int i=1;
	int sum1=0;

	public void func2(int n) 
	{ 	
		
		if(n>0)
		{
		sum1=a1+b1;
		System.out.println(""+sum1);
		a1=b1;
		b1=sum1;
		func2(n-1);
		}
	}


	public  void func1(int n) {
		System.out.println(a+"\n"+b);
		int sum=0;
		while(i<=n)
		{
			sum=a+b;
			System.out.println(""+sum);
			a=b;
			b=sum;
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Exercise3 e1=new Exercise3();
		
		e1.func1(5);
		System.out.println("Recursive------");
		System.out.println(a1+"\n"+b1);
		e1.func2(7);
		
		 
	}

}
