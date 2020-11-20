package com.capgemini.lab1;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l= args[0];
		
		
		switch(l)
		{
			case "RED":
				System.out.println("stop");
				break;
			case "GREEN":
				System.out.println("Go");
				break;
			case "YELLOW":
				System.out.println("Ready");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}

}
