package com.revature.services;

import org.springframework.stereotype.Component;

import com.revature.dao.UserDao;
import com.revature.pojos.User;

@Component
public class UserServices extends UserDao{

    
    public static boolean verifyEmail(String email) {
        System.out.println("inside verifyEmail with email: " + email);
        User user = findByEmail(email);
        
        System.out.println(user);
        
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
    
    public static User verifyUser(User user) {
    	System.out.println("Inside verified user, with user: " + user);
        String email = user.getEmailAddress();
        String password = user.getPassword();
        User authUser = new User();
        authUser.setEmailAddress(email);
        authUser.setPassword(password);
        System.out.println(authUser);
        if(verifyEmail(email)) {
        	System.out.println("Email was verified");
            if(verifyPassword(email, password)) {
            	System.out.println("Password was verified");
                user.setEmailAddress(email);
                user.setPassword(password);
                System.out.println("User " + authUser + " was created and is being returned");
                return authUser;
            }else {
                return null;
            }
        }else {
            return null;
        }
        
        
    }
}
