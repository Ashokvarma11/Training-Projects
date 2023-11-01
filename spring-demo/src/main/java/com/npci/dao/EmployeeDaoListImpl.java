package com.npci.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.npci.beans.Employee;

public class EmployeeDaoListImpl implements EmployeeDao{
	private List<Employee> inMemory;
	
	
	public EmployeeDaoListImpl() {
		inMemory=new ArrayList<>();
	}
	
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		employee.setId(inMemory.size()+1);
		inMemory.add(employee);
		return employee;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		for(Employee employee: inMemory){
			if(employee.getId()==id) {
				return employee;
			}
			
		}
		return null;
	}
 
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return inMemory;
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		Iterator <Employee> iterator= inMemory.iterator();
		while(iterator.hasNext()) {
			Employee emp=iterator.next();
			if(emp.getId()==id) {
				iterator.remove();
				break;
			}
		}		
	}

}
