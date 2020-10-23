package com.bridgelabz;

public class EmpSimple{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOURS=20;
	public static final int NUMBER_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=10;
	static void  EmpPresent() {

		int emphrs=0,totalworkingdays=0,totalEmphrs=0;
		while(totalEmphrs<MAX_HRS_IN_MONTH && totalworkingdays<NUMBER_WORKING_DAYS)
		{
			totalEmphrs++;
			int random =(int) Math.floor(Math.random() * 10 ) % 3;
		switch (random)
		{
		
			case 1:	emphrs=80;
					break;
		
			case 2: emphrs=40;
					break;
			
			default:emphrs=0;//not present
			
		}
		totalEmphrs +=emphrs;
		System.out.println("total empwages" + emphrs);	
}
			int totalEmpWage = totalEmphrs*EMP_RATE_PER_HOURS;
		System.out.println("total working days" + totalEmpWage);
}
	
public static void main(String[] args) {
	EmpSimple obj1=new EmpSimple();
		obj1.EmpPresent();
	}
}


