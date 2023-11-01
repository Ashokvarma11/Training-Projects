package com.profile.beans;

import java.time.LocalDate;

public class Profile {
	private String email;
	private String name;
	//name, password, phone number, date of birth
	private String password;
	private long phonenum;
	private LocalDate dob;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}
	public Profile(String email, String name, String password, long phonenum, LocalDate dob) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.phonenum = phonenum;
		this.dob = dob;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	 
}
