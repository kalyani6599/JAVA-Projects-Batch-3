/*
 * @author A K
 */
package com.cg.lab8;

import java.time.LocalTime;


public class TimeClass implements Runnable{

	@Override
	public void run() {

		while(true)
		{
			System.out.println("time:="+LocalTime.now());
			refresh();
		}
		
	}

	private void refresh() {
		// TODO Auto-generated method stub
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
