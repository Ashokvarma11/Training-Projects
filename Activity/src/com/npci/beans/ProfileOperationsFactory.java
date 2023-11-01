package com.npci.beans;

import com.npci.Activity.ProfileService;
import com.npci.Activity.ProfileServiceImp;

public class ProfileOperationsFactory {
	public static ProfileService getInstance() {
		ProfileService operations= new ProfileServiceImp();
		return operations;
	}

}
 