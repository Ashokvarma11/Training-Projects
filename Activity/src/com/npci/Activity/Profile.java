package com.npci.Activity;

import java.time.LocalDate;

public class Profile {
	private String name;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String password;
	private LocalDate birthday;
	private long phone;
	
	public String getName() {
		return name;
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
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Profile(String email, String name, String password, long phone) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
//		this.birthday = birthday;
		this.phone = phone;
		
	}
	public Profile() {
		super();
		
	}
	@Override
	public String toString() {
		return "email=" + email + ", name=" + name + ", password=" + password + ", birthday="
				+ birthday + ", phone=" + phone+"," ;
	}
	
	
	
	
	

}
