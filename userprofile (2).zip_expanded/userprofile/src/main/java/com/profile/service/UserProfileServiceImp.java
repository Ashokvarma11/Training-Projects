package com.profile.service;

import java.time.LocalDate;

import com.profile.beans.Account;
import com.profile.beans.Profile;
import com.profile.beans.Wallet;

public class UserProfileServiceImp implements UserProfileService{

	@Override
	public Profile save(String email, String name, String password, long phonenum, LocalDate dob) {
		// TODO Auto-generated method stub
		Wallet wallet=new Wallet();
		Account acc=new Account();
		
		
		
		return null;
	}
	
		
		
	} 

