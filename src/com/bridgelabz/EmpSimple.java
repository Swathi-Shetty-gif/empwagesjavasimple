package com.bridgelabz;

public class EmpSimple{
	static void  EmpPresent() {
	double random = Math.floor(Math.random() * 10 ) % 2;
	int IS_PRESENT=1;
	if(random==IS_PRESENT)
	{
		System.out.println("present");
	}
	else
	{
		System.out.println("not present");
	}
	}
public static void main(String[] args) {
	EmpSimple obj1=new EmpSimple();
		obj1.EmpPresent();
	}
}



