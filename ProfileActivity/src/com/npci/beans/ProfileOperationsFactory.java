package com.npci.beans;

import com.npci.ProfileActivity.ProfileService;
import com.npci.ProfileActivity.ProfileServiceImp;

public class ProfileOperationsFactory {
	public static ProfileService getInstance() {
		ProfileService operations= new ProfileServiceImp();
		return operations;
	}

}
