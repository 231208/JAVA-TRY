package com.demo;

public class BreakAndContinueDemo {
	public static void main(String[] args) 
	{
		int i=0;
		while (i<10)
		{
			System.out.println("Value of i :"+i);
			if (i==2)
			break;	
		}
		System.out.println("Break at i :"+i);
	}

}
