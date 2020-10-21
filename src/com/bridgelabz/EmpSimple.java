package com.bridgelabz;

public class EmpSimple {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random =(int) Math.floor(Math.random() * 10 ) % 3;
			
			
			int emphrs=0;
			int EMP_RATE_PER_HOURS=20;
			int empwages=0;
			switch (random)
			{
			
				case 1:	emphrs=80;
						break;
			
				case 2: emphrs=40;
						break;
				
				default:emphrs=0;//not present
				
			}
			empwages=emphrs*EMP_RATE_PER_HOURS;
			System.out.println("emp wages" + empwages);
			
	}

}
