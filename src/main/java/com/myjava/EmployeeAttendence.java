package com.myjava;

public class EmployeeAttendence {
	
	public static void main(String[] args) {
		
			System.out.println("Welcome to Employee Wage Computation");
			int wagPerHrs = 20;
			int workingHours;
			int totalDays=20;
			
			
				int employWorkingTime = (int)(Math.random() *3);
				System.out.println("employee ststus"+employWorkingTime);
				switch(employWorkingTime) {
				case 1:
					System.out.println("Employee is present for full time");
						workingHours=8;
					break;
				case 2:
					System.out.println("Employee is present for part time");
					workingHours=4;
					break;
				default:
					System.out.println("Employee is not present");
					workingHours=0;
					break;
			}
			int totalSalary=workingHours*wagPerHrs*totalDays; 	
			System.out.println("The total salary is " +totalSalary);
		}
	}


