package com.bridgelabz;

public class EmployeeWage {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	String companyName;
	int wagePerHr;
	int maxWorkingDays;
	int maxWorkingHrs;
	int totalWage = 0;

	EmployeeWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	{
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrs = maxWorkingHrs;
	}

	int EmployeeType()
	{
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHrs(int empType)
	{
		switch (empType)
		{
		case IS_FULL_TIME:
			return 8;
		case IS_PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	void calculateTotalWage()
	{
		System.out.println( companyName + " Employee details");
		System.out.println(" ");

		System.out.println("Day		Workinghrs	Wage		Total Working Hrs \n ");
		int workingHrs;
		for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
				&& totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
		{
			int empType = EmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * wagePerHr;
			totalWage += wage;
			System.out.println(day+"		" +workingHrs +"		"+wage+"		"+(totalWorkingHrs + workingHrs));
		}

	}
	void display() {
		System.out.println("");
		System.out.println("Total wage of " +companyName+ " employee is " + totalWage + "\n");
		System.out.println( " ");
	}
=======
	 static final int WAGE_PER_HOUR_IS = 20;
		static final int IS_FULL_TIME = 1;
		static final int IS_PART_TIME = 2;
		static final int MAX_WORKING_DAYS = 20;
		static final int MAX_WORKING_HRS = 100;

		void calculateWage() {
			int total_Employee_Wage = 0;
			int working_Hrs = 0;
			int working_Days = 1;

			while (working_Hrs < MAX_WORKING_HRS && working_Days <= MAX_WORKING_DAYS) {

				int value = (int)Math.floor(Math.random()*10) % 3;
				if(working_Hrs >= 96 && value == IS_FULL_TIME) {
					System.out.println("Max hours reached!!! You can only do Part Time Work");
				}
				else{
					switch (value) {
					case IS_FULL_TIME: {
						int empHrs = 8;
						int empWage = WAGE_PER_HOUR_IS * empHrs; 
						total_Employee_Wage=total_Employee_Wage+empWage;
						working_Hrs+= empHrs;
						System.out.println("Employee is Present Full time and will receive " +WAGE_PER_HOUR_IS*empHrs+ " and working hours is "+working_Hrs+ " Working day is " +working_Days);
						working_Days++;
						break;
					}
					case IS_PART_TIME: {
						int empHrs = 4;
						int empWage = WAGE_PER_HOUR_IS * empHrs; 
						total_Employee_Wage=total_Employee_Wage+empWage;
						working_Hrs+=empHrs;
						System.out.println("Employee is Present Part time and will receive " +WAGE_PER_HOUR_IS*empHrs+ " and working hours is "+working_Hrs+ " Working day is "+ working_Days);
						working_Days++;
						break;
					}
					default:
						System.out.println("Employee is Absent ....and working day is " +working_Days);	
						working_Days++;
					}
				}
			}
			System.out.println("Total Wage of the Employee in a Month is : " +total_Employee_Wage);
		}
}
