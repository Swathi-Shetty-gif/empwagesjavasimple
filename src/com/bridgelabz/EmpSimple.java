package com.bridgelabz;

public class EmpSimple{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOURS=20;
	public static final int NUMBER_WORKING_DAYS=20;
	static void  EmpPresent() {

		int workingdays=20;
		int emphrs=0,empwages=0,totalEmpwage=0;
		for (int i=0;i<=NUMBER_WORKING_DAYS;i++)
		{
			int random =(int) Math.floor(Math.random() * 10 ) % 3;
		switch (random)
		{
		
			case 1:	emphrs=80;
					break;
		
			case 2: emphrs=40;
					break;
			
			default:emphrs=0;//not present
			
		}
		empwages=emphrs*EMP_RATE_PER_HOURS;
		totalEmpwage +=empwages;
		System.out.println("total empwages" + empwages);
		
}
		System.out.println("total working days" + totalEmpwage);
}

			
	
public static void main(String[] args) {
	EmpSimple obj1=new EmpSimple();
		obj1.EmpPresent();
	}
}



