package com.npci.ProfileActivity;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.npci.beans.ProfileOperationsFactory;

public class App {
		public static void main(String[] args) {
			String mail="";
			  String email = "";
			 String name="";
			 String password="";
			 Long phone=0l;
			 String LoginPassword="";
			 String Loginmail="";
			Scanner sc=new Scanner(System.in);
			 int option=0;
			 ProfileService ProfileDetails= ProfileOperationsFactory.getInstance();
			 do {
				 System.out.println("1.Enter the details 2.save 3.delete 4.findall 5.Login 6.exit");
				 option=sc.nextInt();
				 switch(option) { 
				 case 1:
					 System.out.println("Enter the details");
					 System.out.println("enter mail id");
					 email=sc.next();
					 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
					 Pattern pattern = Pattern.compile(regex);
				      //Creating a Matcher object
				      Matcher matcher = pattern.matcher(email);
				      if(matcher.matches()) {
				    	  System.out.println("email is valid");
				      }
				      else {
				    	  System.out.println("not valid");
				      }
				      System.out.println("Enter you name");
				       name=sc.next();
				      System.out.println("Enter your password");
				       password=sc.next();
				       System.out.println("email is phone number");
				       phone=sc.nextLong();			      
				      
					 break;
				 case 2:
					 ProfileDetails.save(new Profile(email,name,password,phone));		 
					 break;
				 
				 case 3:
					 System.out.println("enter the mail to delete:");
					 mail=sc.next();
					 System.out.println("enter the password");
					 password=sc.next();
					 System.out.println(ProfileDetails.del(mail,password));
					 
					 break;
				 case 4:
					 
					 System.out.println(ProfileDetails.findall().size());
					 
					 break;
					
				 case 5:
					 
					 System.out.println("enter the registered mail");
					 Loginmail=sc.next();
					 System.out.println("enter the password");
					 LoginPassword=sc.next();
					
					 ProfileDetails.login(Loginmail,LoginPassword);
					 break;
				 case 6:
					 System.out.println("user exited");
					 break; 
				 }
				 		 
			 }while(option!=6);
			
			
		}

		

	


}
