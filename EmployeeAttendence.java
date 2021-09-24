package com.myjava;

public class EmployeeAttendence {
	
	public static void main(String[] args) {
			
			int WagPerHrs = 20;
			int FullDay = 8;
			int TotalSal;
			System.out.println("Welcome to Employee Wage Computation");
			int EmpStatus=(int)Math.random() * 2;
			if(EmpStatus == 1)
			{
				System.out.println("Employee is present");
				TotalSal=WagPerHrs * FullDay * EmpStatus;
			}
			else
			{
				System.out.println("Employee is not present");
				TotalSal= WagPerHrs * FullDay *EmpStatus;
			}
		System.out.println("The total salary is " +TotalSal);
	}

}
