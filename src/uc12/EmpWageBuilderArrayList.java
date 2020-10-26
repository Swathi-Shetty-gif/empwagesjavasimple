package uc12;

public class EmpWageBuilderArrayList {

	
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		private int numOfCompany=0;
		private ComapnyEmpWage[] companyEmpWageArray;

		public EmpWageBuilderArrayList()
		{
			companyEmpWageArray = new ComapnyEmpWage[5];
		}
		private void addCompanyEmpWage(String company , int empRatePerHour , int numOfWorkingDays , int maxHoursPerMonth)
		{
			companyEmpWageArray[numOfCompany] = new ComapnyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);

			numOfCompany++;
		}
		private void computeEmpWage()
		{
			for(int i = 0 ; i<numOfCompany ; i++)
			{
				companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
				System.out.println(companyEmpWageArray[i]);
			}
		}
		private int computeEmpWage(ComapnyEmpWage companyEmpWage)
		{
			int empHrs=0,totalEmpHrs = 0 , totalWorkingDays = 0;

			while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
			{
				totalWorkingDays++;
				int empCheck = (int)Math.floor(Math.random()*10)%3;
				switch(empCheck)
				{
					case IS_PART_TIME :
						empHrs = 4;
						break;
					case IS_FULL_TIME :
						empHrs = 8;
						break;
					default :
						empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day : " + totalWorkingDays + "EMp Hr : " + empHrs);
			}
			return totalEmpHrs * companyEmpWage.empRatePerHour;
		}
		public static void main(String[] args)
		{
			EmpWageBuilderArrayList empWageBuilder = new EmpWageBuilderArrayList();
			empWageBuilder.addCompanyEmpWage("tata", 20, 2, 10);
			empWageBuilder.addCompanyEmpWage("cogni", 10, 4, 20);
			empWageBuilder.computeEmpWage();
		}
	}