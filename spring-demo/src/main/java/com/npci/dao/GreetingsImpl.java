package com.npci.dao;

import java.util.HashMap;
import java.util.Map;
public class GreetingsImpl implements Greetings {
	
	
	private static Map<String , String >map;
	public GreetingsImpl() {
		map=new HashMap<>();
		
		map.put("Telugu","ayyanamaskram");
		map.put("Hindi", "namaskar");
		map.put("Tamil", "vanakkam");
		map.put("French", "Bonjour");
		map.put("kannada", "uthappam");
	}
	

	@Override
	public String greet(String name, String language) {
		// TODO Auto-generated method stub
		String lang=language;	
		
		String value=map.get(lang);
		return value+name;
	}
	

}
