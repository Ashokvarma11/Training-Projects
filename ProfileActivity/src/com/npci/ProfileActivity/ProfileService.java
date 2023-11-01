package com.npci.ProfileActivity;

import java.util.Set;

public interface ProfileService {
	

		Profile save(Profile p);
		String del(String username,String password);
		Set<Profile> findall();
		int login(String username,String password);

	
}
