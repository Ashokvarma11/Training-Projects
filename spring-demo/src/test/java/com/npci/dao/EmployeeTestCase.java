package com.npci.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npci.beans.Employee;

public class EmployeeTestCase {
	
private EmployeeDao employeeDao;
	
	private static ApplicationContext context;
	//load the application context before any test case begins
	@BeforeAll
	public static void load() {
		
	
	context =new ClassPathXmlApplicationContext("beans.xml");
	}
	
	//executed only once but after all the test case ends
	@AfterAll
	public static void unload() {
		ClassPathXmlApplicationContext context2=(ClassPathXmlApplicationContext)context;
		context2.close();
	}
	@BeforeEach
	public void intitalizeGreetings() {
		 employeeDao= (EmployeeDao)context.getBean("b2");
	}
	@AfterEach
	public void deintitalizeGreetings() {
		employeeDao= null;
	}
	@Test
	public void testStore() {
		Employee employee1=new Employee(0,"A",45000);
		Employee storedEmployee=employeeDao.save(employee1);
		assertTrue(storedEmployee.getId()!=0);
				
	}
	@Test
	public void testFindById() {
		Employee employee1=new Employee(0,"A",45000);
		Employee storedEmployee=employeeDao.save(employee1);
		Employee foundEmployee=employeeDao.findById(storedEmployee.getId());
		assertEquals(storedEmployee.getId(),foundEmployee.getId());
				
	}@Test
	public void testfindAll() {
		Employee employee1=new Employee(0,"A",45000);
		Employee employee2=new Employee(0,"B",45000);
		employeeDao.save(employee1);
		employeeDao.save(employee2);
		int size=employeeDao.findAll().size();
		assertTrue(size>=2);
				
	}
	@Test
	public void testDelete() {
		Employee employee1=new Employee(0,"A",45000);
		Employee employee2=new Employee(0,"B",45000);
		employeeDao.save(employee1);
		employeeDao.save(employee2);
		int size1=employeeDao.findAll().size();
		employeeDao.del(2);
		int size2=employeeDao.findAll().size();
		assertTrue(size2<size1);
				
	}
	
}