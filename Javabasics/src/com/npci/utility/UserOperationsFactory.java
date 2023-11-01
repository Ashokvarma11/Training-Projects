package com.npci.utility;
import com.npci.service.*;
public class UserOperationsFactory {
	public static UserOperations getInstance() {
		UserOperations operation=new UserService();
		return operation;
	}
}
