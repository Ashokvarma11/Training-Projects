package com.npci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.npci.beans.Employee;

//DriverManagerDataSource>>LocalSessionFactoryBean>>HibernateTemplate>>EmployeeDaoORMImpl
//spring container must create this Dao object and supply HibernateTemplate
//<bean id="dao" class="com.npci.dao.EmployeeDaoORMImpl>
//<property name="template" ref="hibernateTemplaateBean"/>

@Repository
public class EmployeeDaoORMImpl implements EmployeeDao{
	@Autowired
	private HibernateTemplate template;

	




	@Override
	
	public Employee save(Employee employee) {
		//save method returns a serializable id that is generated
		int id=(int)template.save(employee);//generates insert query
		// TODO Auto-generated method stub
		return findById(id);
		
	}



	@Override
	
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		//select * from employee where primarykey=id value
		return template.get(Employee.class,id);
	}



	@Override
	public List<Employee> findAll() {
		//loadAll -> select * from employee -each record is added as an employee in the list
		// TODO Auto-generated method stub
		return template.loadAll(Employee.class);
	}



	@Override

	public void del(int id) {
		//delete(T t) delete query is e
		Employee employee= findById(id);
		if(employee!=null) {
			template.delete(employee);
		}
		// TODO Auto-generated method stub
		
	}
	
}
