package com.cg.lab8;

public class TimeTester {

	public static void main(String[] args) {
		Runnable runnable=new TimeClass
				();
		Thread t1=new Thread(runnable,"demo");
		t1.start();

	}

}
