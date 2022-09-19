package com.fsd.gl.oops;

import java.util.Scanner;

public class labassignment1oops {

	public static void main(String[] args) {
		
		{
	        Scanner sc=new Scanner(System.in);
	        Employee emp=new Employee("darshan", "sharma1");
	        Department department;
	        CredentialService cred= new CredentialService();;
	        int choice=0;
	        do {
	            System.out.println("Please enter the department from the following");
	            System.out.println("1. Technical 2. Admin 3. Human Resources 4. Legal");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    department = new Department("tech");
	                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());
	                    break;
	                case 2:
	                    department = new Department("admin");
	                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());

	                    break;
	                case 3:
	                    department = new Department("hr");
	                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());
	                    break;
	                case 4:
	                    department = new Department("legal");
	                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());
	                    break;
	                default:
	                    System.out.println("Invalid selection. enter within 1, 2, 3 and 4");

	                     }
	        }while(choice!=0);
	        sc.close();
		}

}
}
