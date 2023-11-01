package com.npci.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npci.beans.Employee;
import com.npci.service.EmployeeService;

 
public class TestControllerFromMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-orm-beans.xml");
		EmployeeService ser=(EmployeeService)context.getBean("emps");
		List<Integer> ids=ser.createEmployees(new Employee(0,"x",2002),new Employee(0,"y",3000));
		System.out.println(ids);
		
	}
}
