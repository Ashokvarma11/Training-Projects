package com.npci.service;
import java.util.Arrays;

import com.npci.User;
import com.npci.exceptions.UserNotFoundException;
public class UserService implements UserOperations {
	
	private static User[] users=new User[5];
	
	private static int index=0;
	@Override
	public int store(User user) {
		if(index>=5) {
			return -1;
		} 
		users[index++]=user;
		return 1;
	}  
	@Override
	public User[] findAll() {
		User[] copy=new User[index];
		for(int i=0;i<index;i++) {
			copy[i]=users[i];
			
	}
		return copy;
	

}
	@Override
	public User findUserName(String name) throws UserNotFoundException {
		User[] arr=findAll();
		for(User u:arr) {
			if(u.getName().equals(name)) {
				return u;
			}
		}
		
		throw new UserNotFoundException("sorry "+name+" found");
	} 
}
