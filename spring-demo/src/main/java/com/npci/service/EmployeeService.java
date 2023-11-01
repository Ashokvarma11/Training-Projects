package com.npci.service;

import java.util.List;

import com.npci.beans.Employee;
import com.npci.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	List<Integer> createEmployees(Employee employee1,Employee...employee);
	Employee createEmployee(Employee employee);
	Employee findEmployee(int id) throws EmployeeNotFoundException;
	void delteEmployee(int id) throws EmployeeNotFoundException;
	List<Employee> findEmployeesByName(String name);
	List<Employee>findEmployees();
	

}
