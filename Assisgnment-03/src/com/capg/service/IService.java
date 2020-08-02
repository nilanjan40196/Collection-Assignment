package com.capg.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.beans.Employee;

public interface IService {
	public boolean validateEmpId(String empId);
	public boolean validateSalary(double sal);
	public boolean validateName(String name);
	public boolean vaidateJoinDate(LocalDate date);
	
	public void createEmployee(Employee emp);
	public List<Employee> getEmployees();

}
