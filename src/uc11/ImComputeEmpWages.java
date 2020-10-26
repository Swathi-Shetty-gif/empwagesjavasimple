package uc11;

public interface ImComputeEmpWages {
	
		public void addCompanyEmpWage(String company , int empRatePerHour , int numOfWorkingDays , int mxHoursPerMonth);
		public void computeEmpWage();
		public int getTotalWage(String company);
	}


