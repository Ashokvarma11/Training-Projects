package com.npci;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TestUnique {
	public static void main(String[] args) {
		
		
		Set <Employee> employees=new HashSet<>();
		employees.add(new Employee(100,"alex",45545,LocalDate.parse("2001-08-17")));
		employees.add(new Employee(100,"bard",45220,LocalDate.parse("1990-10-12")));
		employees.add(new Employee(100,"yarn",45220,LocalDate.parse("2003-12-25")));
		employees.add(new Employee(200,"dennis",45220,LocalDate.parse("1989-03-20")));
System.out.println("size"+employees.size());




for(Employee e:employees) {
	System.out.println(e);
}
		
		Set<Integer> integers=new HashSet<>();
		integers.add(23);
		integers.add(12);
		integers.add(7);
		integers.add(11);
		integers.add(7);
		System.out.println("size "+integers.size());
		for(int value:integers) {
			System.out.println(value);
		}
		
		
	}

}
