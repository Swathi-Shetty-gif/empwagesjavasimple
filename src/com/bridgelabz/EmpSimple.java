package com.bridgelabz;
import java.util.HashMap;

public class EmpSimple {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME=2;
	public static void main(String[] args) {
		EmpSimple ew=new EmpSimple();
		ew.WagesCalculation("infosys", 20);
		ew.WagesCalculation("bridgelabz", 40);
		ew.WagesCalculation("wipro", 60);
		ew.WagesCalculation("cognizath", 80);
	}
		public void WagesCalculation(String company,int Wages_Per_Hour ){
			
			
			int full_Day_Hour=8;
			int Part_Day_Hour=4;
			int days=20;
			int workingDays=1;
			int workingHour=0;
			int totalWages=0;
			while (workingDays <= days && workingHour <100 ) {
			int checkout=(int) (Math.floor(Math.random() *10) %2+1);
			switch(checkout){
				case  FULL_TIME:int total=  Wages_Per_Hour * full_Day_Hour;
									workingHour=workingHour+full_Day_Hour;
									totalWages=totalWages+total;
									break;
				case PART_TIME :int total1= Wages_Per_Hour * Part_Day_Hour;
									workingHour=workingHour + Part_Day_Hour;
									totalWages=totalWages+total1;
									break;
				default : System.out.println("0");
			}
			workingDays++;					
			}
			
			HashMap<String, Integer> cm = new HashMap<String, Integer>();
			cm.put(company, totalWages);
			for (String i : cm.keySet()) {
			      System.out.println( i + " wages in month " + cm.get(i));
		}
		}
	
}