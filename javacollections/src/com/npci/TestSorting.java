package com.npci;
import com.npci.Employee;
import java.time.LocalDate;
import java.util.*;

public class TestSorting {
	
	public static void main(String[] args) {
		
	//TreeSet looks for comparable type of sort
//		String,integer,double and so on implements Comparable.compareTo(T t)
//		TreeSet uses Comparable to compare by default
	Set<String> strings=new TreeSet<>((x,y)->y.compareTo(x));
	strings.add("Hello");
	strings.add("hello");
	strings.add("Test");
	strings.add("HELLO");
	System.out.println(strings);
	//TreeSet can also sort Employee or other complex types but there should be either 
	//Comparable or Comparator for Employee 
	Set<Employee> employees=new TreeSet<>((x,y)->Double.compare(y.getSalary(), x.getSalary()));//it searches for Comparable by default
	employees.add(new Employee(666,"ibram",70000,LocalDate.parse("1999-03-21")));
	employees.add(new Employee(200,"jack",89848,LocalDate.parse("2002-03-12")));
	employees.add(new Employee(610,"hack",29874,LocalDate.parse("1809-03-12")));
	for(Employee emp:employees) {
		System.out.println(emp);
	}
	
	}
}
