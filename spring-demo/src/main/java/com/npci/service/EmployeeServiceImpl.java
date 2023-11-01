package com.npci.service;

import java.util.ArrayList;
import java.util.List;
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
	@Transactional
	public List<Integer> createEmployees(Employee employee1, Employee... employee) {
		// TODO Auto-generated method stub
		
		Employee e=dao.save(employee1);
		List<Integer> idList=new ArrayList<>();
		idList.add(e.getId());
		for(Employee emp:employee) {
			Employee e2=dao.save(emp);
			idList.add(e2.getId());
		}
		return idList;
		
	
		
	}
		
		
		
	

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee employee= dao.findById(id);
		if(employee !=null) 
			return employee;
		throw new EmployeeNotFoundException("id"+id+"not found");
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delteEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee employee=findEmployee(id);
		dao.del(employee.getId());
		
	}

	@Override
	public List<Employee> findEmployeesByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> employees =findEmployees();
		List<Employee> names=employees.stream().filter(item->item.getName().equals(name)).collect(Collectors.toList());
		return names;
	}

	@Override
	public List<Employee> findEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
