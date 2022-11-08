package com.demo;

class ParentClass{
	int a = 10;
	public int b = 20;
	protected int c  = 30;
	private int d = 40;
	
	void showdata()
	{
		System.out.println("Inside Parent Class");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
		System.out.println("d ="+d);
	}
}

class Childclass extends ParentClass{
	
	void accessdata() {
		System.out.println("Inside ChildClass");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
	//	System.out.println("d ="+d);
		
	}	
}

public class Exercise15 {

	public static void main(String[] args) {

		Childclass child = new Childclass();
		child.showdata();
		child.accessdata();

	}

}
