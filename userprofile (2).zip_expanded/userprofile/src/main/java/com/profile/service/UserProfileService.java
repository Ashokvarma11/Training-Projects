package com.profile.service;

import java.time.LocalDate;

import com.profile.beans.Profile;

public interface UserProfileService {
	public Profile save(String email, String name, String password, long phonenum, LocalDate dob);
	
	

}
