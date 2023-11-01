package com.npci.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import all the annotations from jakarta/javax.persistance package
@Entity
@Table
public class Employee {
	//@column annotation is not required on any property
	//because property names are same as column names
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto-geneates the id based on auto-increment
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	

}
