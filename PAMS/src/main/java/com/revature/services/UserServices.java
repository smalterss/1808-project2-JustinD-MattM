package com.revature.services;

import org.springframework.stereotype.Component;

import com.revature.dao.UserDao;
import com.revature.pojos.User;

@Component
public class UserServices extends UserDao{

	
	public static boolean verifyEmail(String email) {
		
		User user = findByEmail(email);
		
		if(user.getEmailAddress().equals(email)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean verifyPassword(String email, String password) {
		User user = findByEmail(email);
		if(password.equals(user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static User verifyUser(String email, String password) {
		
		User user = new User();
		
		if(verifyEmail(email)) {
			if(verifyPassword(email, password)) {
				user.setEmailAddress(email);
				user.setPassword(password);
				return user;
			}else {
				return null;
			}
		}else {
			return null;
		}
		
		
	}
}
