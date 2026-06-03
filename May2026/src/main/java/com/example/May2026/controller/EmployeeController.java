package com.example.May2026.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.May2026.entity.Employee;
import com.example.May2026.service.EmployeeService;


@RestController

@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return service.saveEmployee(emp);
	}

	@GetMapping("/all")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	@GetMapping("/{id}")
	public Employee getEmployeeByid(@PathVariable Integer id)
	{
		return service.getEmployeeById(id);
	}
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee emp)
	{
		return service.updateEmployee(id, emp);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id)
	{
		return service.deleteEmployee(id);
	}
	
}