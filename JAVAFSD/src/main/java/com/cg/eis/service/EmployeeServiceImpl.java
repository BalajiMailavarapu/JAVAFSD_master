package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	Scanner sc = new Scanner(System.in);
	
	public void getEmployeeDetails(Employee emp)
	{
		System.out.println("Enter ID:");
		emp.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Enter name:");
		emp.setName(sc.nextLine());
		
		System.out.println("Enter salary:");
		emp.setSalary(sc.nextDouble());
		
		sc.nextLine();
		
		System.out.println("Enter designation:");
		emp.setDesignation(sc.nextLine());
		
	}
	
	@Override
	public void findInsuranceScheme(Employee emp)
	{
		double salary = emp.getSalary();
		String desig = emp.getDesignation();
		
		if(salary>50000 && desig.equalsIgnoreCase("Manager"))
		{
			emp.setInsuranceScheme("Scheme A");
		}
		else if(salary >5000 && salary<=50000 && desig.equalsIgnoreCase("Programmer"))
		{
			emp.setInsuranceScheme("Scheme B");
		}
		else if(salary>5000 && salary<=20000 && desig.equalsIgnoreCase("Clerk"))
		{
			emp.setInsuranceScheme("Scheme C");
		}
		else
		{
			emp.setInsuranceScheme("No Scheme");
		}
	}
	
	@Override
	public void displayEmployee(Employee emp)
	{
		System.out.println("\n--Employee Details---");
		System.out.println("ID:" +emp.getId());
		System.out.println("Name:" +emp.getName());
		System.out.println("Salary:" +emp.getSalary());
		System.out.println("Designation:"+emp.getDesignation());
		System.out.println("Insurance Scheme:"+emp.getInsuranceScheme());
	}
}
