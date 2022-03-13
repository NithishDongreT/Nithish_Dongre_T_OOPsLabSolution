package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;


public class DriverApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to IT Support Administrator System");
		
//		Bank bank = new Bank("Indian Bank", "IB2001", "India");
		
		// Creating an console interface
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {

			System.out.println("Please enter the number of the department from the following");
			System.out.println("Enter Option 1 to Technical");
			System.out.println("Enter Option 2 to Admin");
			System.out.println("Enter Option 3 to Human Resource");
			System.out.println("Enter Option 4 to Leagal");
			System.out.println("Enter Option 0 to Exit");
			option = scanner.nextInt();
			if (option == 0) {
				break;
			}
			System.out.println("Please Enter Employee First Name ");
			String First_name = scanner.next();

			System.out.println("Please Enter Employee Last Name ");
			String Last_name = scanner.next();
			
			Employee e1 = new Employee(First_name,Last_name);

			System.out.println("Dear " + First_name +" your generated credentials are as follows");			
			switch(option) {
			case 1:
				// Technical
				System.out.println("Email    --> " +e1. generate_email_address(e1.getFirst_Emp_name(),e1.getLast_Emp_name(),"Technical"));
				System.out.println("Password --> " +e1.getAlphaNumericString(16));
				break;
			case 2:
				// Admin
				System.out.println("Email    --> " +e1. generate_email_address(e1.getFirst_Emp_name(),e1.getLast_Emp_name(),"Admin"));
				System.out.println("Password --> " +e1.getAlphaNumericString(16));				
				break;
			case 3:
				// Human Resource
				System.out.println("Email    --> " +e1. generate_email_address(e1.getFirst_Emp_name(),e1.getLast_Emp_name(),"Human Resource"));
				System.out.println("Password --> " +e1.getAlphaNumericString(16));				
				break;
			case 4:
				// Leagal
				System.out.println("Email    --> " +e1. generate_email_address(e1.getFirst_Emp_name(),e1.getLast_Emp_name(),"Leagal"));
				System.out.println("Password --> " +e1.getAlphaNumericString(16));
				break;
			default:
				System.out.println("Please Enter the Right Option");
			}
		} while(option != 0);
		scanner.close();

	}

}
