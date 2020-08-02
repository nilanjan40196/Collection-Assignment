package com.capg.dao;

import java.util.ArrayList;
import java.util.List;

import com.capg.beans.Employee;

public class DaoImpl implements IDao{
	
	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void createEmployee(Employee emp) {
		employees.add(emp);
		System.out.println("Employee is created");
		
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	

}
