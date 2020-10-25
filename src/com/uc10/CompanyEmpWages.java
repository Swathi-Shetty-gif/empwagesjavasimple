package com.uc10;

public class CompanyEmpWages {


	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxhoursPerMonth;
	public final String company;
	public int totalEmpWage;
	public CompanyEmpWages(String company, int empRatePerHour, int numOfWorkingDays, int maxhoursPerMonth)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxhoursPerMonth=maxhoursPerMonth;
	}
	//@override
		public String toString(){
		return "Total Emp wages for company " +company+ "is" +totalEmpWage;
		}
		public void setTotalEmpWage(int totalEmpWage)
		{
			this.totalEmpWage=totalEmpWage;
		}
}

		