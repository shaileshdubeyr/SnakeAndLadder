package com.myjava;

public class EmployeeAttendence {
	
	public static void main(String[] args) {

			System.out.println("Welcome to Employee Wage Computation");
			int EmpStatus = (int)Math.random() * 2;
			System.out.println(EmpStatus);
			if(EmpStatus == 1)
			{
				System.out.println("Employee is present");
			}
			else
			{
				System.out.println("Employee is not present");
			}
	}

}
