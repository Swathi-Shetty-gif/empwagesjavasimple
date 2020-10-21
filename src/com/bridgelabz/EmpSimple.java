package com.bridgelabz;

public class EmpSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
