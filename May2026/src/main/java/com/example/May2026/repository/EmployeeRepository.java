package com.example.May2026.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.May2026.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	

}