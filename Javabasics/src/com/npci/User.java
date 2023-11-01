package com.npci;

import java.time.LocalDate;

public class User {
	private String name;
	public User(String name, long number, LocalDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}
	private long number;
	private LocalDate birthday;
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public User(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		if(birthday==null) {
			return "Name"+name+"Phone="+number;
		}
		return "Name"+name+"Phone="+number+"Birthday"+birthday;
	}
	
	

}
