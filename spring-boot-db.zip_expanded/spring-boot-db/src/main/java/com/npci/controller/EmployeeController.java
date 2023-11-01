package com.npci.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.beans.Employee;
import com.npci.exceptions.EmployeeNotFoundException;
import com.npci.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	private List<String> exceptionList =new ArrayList<>();
	@GetMapping(path="/employees")
	public ResponseEntity<Object> getAllEmployees(){
		List<Employee> employees =service.findEmployees();
		return ResponseEntity.status(200).body(employees);
	}
	
	@GetMapping(path="/employees/{id}")
	public ResponseEntity<Object> getAllEmployees(@PathVariable("id") int id){
		try {
			Employee employee =service.findEmployee(id);
			return ResponseEntity.status(200).body(employee);
			
		}catch(EmployeeNotFoundException e) {
			exceptionList.add(e.getMessage());
			Map<String,String> errors=new HashMap<>();
			errors.put("error",e.getMessage());
			return ResponseEntity.status(404).body(errors);
			
			
			
		}
		
	}
	//create a webservice to store the employee object pass only ("name":"akks","salary":78993)
	//import MediaType from org.springframework
	
	
	@PostMapping(path="/employees",consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeEmployee(@RequestBody Employee employee){
		//json properties are automatically mapped to employee properties when names are same
		Employee created=service.createEmployee(employee);
		
		
		return ResponseEntity.status(200).body(created);
		
	}
	@GetMapping(path="/employees/searchByName/{name}")
	public ResponseEntity<Object> getEmployees (@PathVariable("name") String name){
		List<Employee> employees =service.findEmployeesByName(name);
		return ResponseEntity.status(200).body(employees);
	}

}
