package com.npci;

import java.time.LocalDate;
import java.util.Scanner;

import com.npci.exceptions.UserNotFoundException;
import com.npci.service.UserOperations;
import com.npci.service.UserService;
import com.npci.utility.UserOperationsFactory;

public class Test {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 UserOperations service=UserOperationsFactory.getInstance();
		 int option=0;
		 do {
			 System.out.println("1:store 2:find 3: find by name 4:exit");
			 option=sc.nextInt();
			 switch(option) {
			 case 1:
				 System.out.println("enter your name");
				 String name=sc.next();
				 System.out.println("enter your phone");
				 Long number=sc.nextLong();
				 System.out.println("Enter your deathday");
				 LocalDate birthday=LocalDate.parse(sc.next());
				 User user=new User(name,number,birthday);
				 int status=service.store(user);
				 if(status==1) {
					 System.out.println("user stored...");
					 
				 }else {
					 System.out.println("user failed to store");
				 }
				 break;
			 case 2:
				 User[] users=service.findAll();
				 for(User item:users) {
					 System.out.println(item);
				 }
				 break; 
			 case 3:
				 System.out.println("enter name");
				 name=sc.next();
				try {
					user=service.findUserName(name);
					System.out.println("Hello "+user.getName()+" your Deathday "+user.getBirthday());

				} catch (UserNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
				}
				 break;
			 } 
		 }
		 while(option!=4);	
	}

}
 