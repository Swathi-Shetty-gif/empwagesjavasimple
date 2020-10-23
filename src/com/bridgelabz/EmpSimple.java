package com.bridgelabz;

public class EmpSimple{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private final int EMP_RATE_PER_HOURS = 0;
	private final int NUMBER_WORKING_DAYS = 0;
	private final int MAX_HRS_IN_MONTH = 0;
	private final String company = "";
	public static int ComputeWage(String company,int EMP_RATE_PER_HOURS,int NUMBER_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
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
		return  totalEmpWage;
}

	
public static void main(String[] args) {
	ComputeWage("infosys", 20,2,10);
	ComputeWage("reliance",10,4,20);
	ComputeWage("tata",10,4,20);
	ComputeWage("bridgelabz",10,4,20);
	}
}





















//package com.bridgelabz;
//
//public class EmpSimple {
//	public static final int IS_PART_TIME = 1;
//	public static final int IS_FULL_TIME = 2;
//	private final String company;
//	private final int empRateHours;
//	private final int numofWorkDays;
//	private final int maxHoursperMonth;
//
//	public EmpSimple(String company, int empRateHours, int numofWorkDays, int maxHoursperMonth) {
//		this.company = company;
//		this.empRateHours = empRateHours;
//		this.maxHoursperMonth = maxHoursperMonth;
//		this.numofWorkDays = numofWorkDays;
//	}
//
//	private int calEmpWage() {
//		int empHrs = 0, totalEmpHours = 0, totalWorkDays = 0;
//
//		while (totalEmpHours <= maxHoursperMonth && totalWorkDays < numofWorkDays) {
//			totalWorkDays++;
//			int empCheck = (int) (Math.random() * 10 % 3);
//			switch (empCheck) {
//			case IS_PART_TIME:
//				empHrs = 4;
//				break;
//			case IS_FULL_TIME:
//				empHrs = 8;
//				break;
//			default:
//				empHrs = 0;
//			}
//			totalEmpHours += empHrs;
//			System.out.println("Day: " + totalWorkDays + " Emp Hrs: " + empHrs);
//		}
//		System.out.println("Total Employee work Hours: " + totalEmpHours);
//		return totalEmpHours * empRateHours;
//	}
//
//	public static void main(String[] args) {
//		System.out.println("**WELCOME TO EMPLOYEE WAGE COMPUTATION**");
//		EmpSimple info = new EmpSimple("infosys", 20, 30, 100);
//		EmpSimple tata = new EmpSimple("tata", 40, 40, 100);
//		System.out.println("Total Employee Wage for " + info.company + ": " + info.calEmpWage());
//		System.out.println("Total Employee Wage for " + tata.company + ": " + tata.calEmpWage());
//	}
//}
