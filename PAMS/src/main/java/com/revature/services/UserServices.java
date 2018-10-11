package com.revature.services;

import java.util.List;

import com.revature.dao.UserDao;
import com.revature.pojos.User;

public class UserServices extends UserDao{

	public static boolean verifyEmail(String email) {
		List<User> users = findAll();
		for(User u : users) {
			if(u.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
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
				user.setUsername(email);
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
