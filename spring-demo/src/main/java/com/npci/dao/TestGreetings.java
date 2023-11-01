package com.npci.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGreetings {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Greetings greetings=(Greetings)context.getBean("bl");
		String result=greetings.greet("ashok", "Hindi");
		System.out.println(result); 
		ClassPathXmlApplicationContext cpa=(ClassPathXmlApplicationContext)context;
		cpa.close();
	}

}
