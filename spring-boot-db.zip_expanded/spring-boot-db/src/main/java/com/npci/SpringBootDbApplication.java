 package com.npci;

import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.npci.beans.Employee;
import com.npci.service.EmployeeService;

@SpringBootApplication
public class SpringBootDbApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(SpringBootDbApplication.class, args);
//		EmployeeService ser=(EmployeeService)ctx.getBean("emps");
//		Employee employee =ser.createEmployee(new Employee(0,"abc",30000));
//		System.out.println("stored employee is "+employee.getId());
//		java.util.List<Employee> employees =ser.findEmployees();
//		employees.forEach(item->System.out.println("id="+item.getId()));

		
		
	}

}
