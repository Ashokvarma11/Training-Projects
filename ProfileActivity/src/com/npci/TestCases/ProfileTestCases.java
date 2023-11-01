package com.npci.TestCases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.Console;

import org.junit.jupiter.api.Test;

import com.npci.ProfileActivity.Profile;
import com.npci.ProfileActivity.ProfileService;
import com.npci.ProfileActivity.ProfileServiceImp;
import com.npci.beans.ProfileOperationsFactory;

public class ProfileTestCases {

	ProfileService ps= ProfileOperationsFactory.getInstance();
	@Test
	public void testSave() {
		
		int before=ps.findall().size();
		Profile p=new Profile("ashok@gmail.com","ashok","111",303400404);
		ps.save(p);
		int after=ps.findall().size();
		assertTrue(before<after);
	}
	@Test
	public void testDel() {
		
		Profile p=new Profile("ash@gmail.com","ashok","111",303400404);
		Profile p1=new Profile("varma@gmail.com","varma","121",303400404);
		ps.save(p);
		ps.save(p1);
		int actualsize=ps.findall().size();
		
		ps.del("ash@gmail.com", "111");
		int afterdelsize=ps.findall().size();
		assertTrue(afterdelsize<=actualsize);
		
	}
	@Test
	public void testLogin() {
		Profile p=new Profile("ash@gmail.com","ashok","111",303400404);
		Profile p1=new Profile("varma@gmail.com","varma","121",303400404);
		ps.save(p);
		ps.save(p1);
		int loginval=ps.login("ash@gmail.com", "111");
		assertTrue(loginval!=0);
		
	}
	@Test
	public void testFindall() {
		
		Profile p=new Profile("ash@gmail.com","ashok","111",89288292);
		Profile p1=new Profile("varma@gmail.com","varma","121",919763673);
		Profile p2=new Profile("ashok@gmail.com","aaa","333",782892873);
		ps.save(p);
		ps.save(p1);
		int find=ps.findall().size();
		assertTrue(find>=2);
		
		
	}

}
