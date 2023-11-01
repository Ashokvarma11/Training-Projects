package com.npci.Activity;


import java.util.*;

public class ProfileServiceImp implements ProfileService {
	
	Set <Profile> profiles=new HashSet<>();
	
	 
	@Override
	public Profile  save(Profile p) {
		profiles.add(p);
		System.out.println("user saved");
		return p;
	}
	@Override
	public String del(String mail,String password1) {
	Profile currentdel=null;
	for(Profile dp:profiles) {
		
		if(dp.getEmail().equals(mail) && dp.getPassword().equals(password1)) {
			currentdel=dp;
			break;
			
			
		}
	
		
	}
	
	if(currentdel!=null) {
		System.out.println(currentdel);
		profiles.remove(currentdel);
		return "user delted";
	}
	
	return "usernot found";
	
	
//		
	}
	@Override
	public void findall() {
		System.out.println(profiles);
	}
	@Override
	public void login(String username,String password) {
		System.out.println(profiles);
		int count=0;
		for(Profile dp:profiles) {
			
			if(dp.getEmail().equals(username) && dp.getPassword().equals(password)) {
				count=count+1;
				

			
			}
			else {
				count=count;
				
			}
		
			
		}
		if(count>0) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Invalid username/password");

			
		}
		
		// TODO Auto-generated method stub
		
	}
}
