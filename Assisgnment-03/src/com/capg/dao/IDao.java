package com.capg.dao;

import java.util.List;

import com.capg.beans.Employee;

public interface IDao {
	public void createEmployee(Employee emp);
	public List<Employee> getEmployees();
}
