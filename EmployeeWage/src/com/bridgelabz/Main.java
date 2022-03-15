package com.bridgelabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Employee Wages....\n");
		System.out.println("Enter \n  Employee Wage per hour \n  Employee Hours");
		Scanner scanner = new Scanner(System.in);
		int wagePerHour = scanner.nextInt();
		int empHrs = scanner.nextInt();
		EmployeeWage.dailyWage(wagePerHour,empHrs);
		scanner.close();
	}
}
