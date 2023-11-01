package com.npci.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsTestCase {
	private Greetings greetings;
	
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
		 greetings= (Greetings)context.getBean("bl");
	}
	@AfterEach
	public void deintitalizeGreetings() {
		 greetings= null;
	}
	@Test
	public void testGreetings() {
		
		String actual=greetings.greet("ashok","Hindi");
		assertEquals("namaskarashok",actual);
		actual=greetings.greet("ashok","Telugu");
		assertEquals("ayyanamaskramashok",actual);
		
	}

}
