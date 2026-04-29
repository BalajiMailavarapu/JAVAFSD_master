package com.cg.eis.bean;

import java.util.Scanner;

public class EmployeeService {
	
	public void validateSalary(Employee emp) throws EmployeeException
	
	{
		double salary = emp.getSalary();
		
		if(emp.getSalary()<3000)
		{
			throw new EmployeeException("Salary is below 3000, not allowed");
		}
		
		if(salary>=3000 && salary<=5000)
		{
			emp.setDesignation("System admin");
			emp.setInsuranceScheme("No Scheme");
		}
		else if(salary<=2000)
		{
			emp.setDesignation("Systems engineer");
			emp.setInsuranceScheme("Scheme C");
		}
		else if(salary<=4000)
		{
			emp.setDesignation("Programmer");
			emp.setInsuranceScheme("Scheme B");
		}
		else
		{
			emp.setDesignation("Manager");
			emp.setInsuranceScheme("Scheme A");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		EmployeeService service = new EmployeeService();
		
		System.out.println("Enter Name:");
		emp.setName(sc.next());
		
		System.out.println("Enter Salary:");
		emp.setSalary(sc.nextDouble());
		
		try
		{
			service.validateSalary(emp);
			System.out.println("\n--- Employee details");
			
			System.out.println("Name:"+emp.getName());
			System.out.println("Salary:"+emp.getSalary());
			System.out.println("Designation:"+emp.getDesignation());
			System.out.println("Insurance Scheme:"+emp.getInsuranceScheme());
		}
		catch(EmployeeException e)
		{
			System.out.println("Error: "+ e.getMessage());
			
		}
		sc.close();
		

	}

}