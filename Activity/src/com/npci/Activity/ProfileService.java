package com.npci.Activity;

public interface ProfileService {

	Profile save(Profile p);
	String del(String username,String password);
	void findall();
	void login(String username,String password);

}