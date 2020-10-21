package com.bridgelabz;

public class EmpSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double random = Math.floor(Math.random() * 10 ) % 2;
			int IS_PRESENT=1;
			int emphrs=0;
			int EMP_RATE_PER_HOURS=20;
			int empwages=0;
			if(random==IS_PRESENT)
			{
				emphrs=80;
				
			}
			else
			{
				emphrs=0;//not present
				
			}
			empwages=emphrs*EMP_RATE_PER_HOURS;
			System.out.println("emp wages" + empwages);
			
	}

}
