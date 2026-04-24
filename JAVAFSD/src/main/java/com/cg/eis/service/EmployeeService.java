package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	void getEmployeeDetails(Employee emp);
	void findInsuranceScheme(Employee emp);
	void displayEmployee(Employee emp);
}
