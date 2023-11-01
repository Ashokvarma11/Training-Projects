package com.npci.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;
import com.npci.exceptions.EmployeeNotFoundException;

@Service("emps")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao;

	@Override
	public List<Integer> createEmployees(Employee employee1, Employee... employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employee> op=dao.findById(id);
		
		return op.orElseThrow(()->new EmployeeNotFoundException("id"+id+"not found"));
	}

	@Override
	public void delteEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
				}

	@Override
	public List<Employee> findEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	

	
	

}
