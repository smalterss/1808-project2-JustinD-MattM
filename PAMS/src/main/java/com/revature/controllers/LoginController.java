package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.User;
import com.revature.services.UserServices;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
public class LoginController {
	private UserServices us;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginGet(HttpSession sess){
		System.out.println("Inside of the Get method in Login Controllers");
		if (sess.getAttribute("user") != null) {
			return "home";
		}else {
			return "login";
		}
		
	}
	
	@CrossOrigin
	@RequestMapping(value="/login", method = RequestMethod.POST, consumes= {"application/json"})
	public User loginPost(@RequestBody User user, HttpSession sess) {
	User authUser = us.verifyUser(user);
	
	if (authUser != null) {
		sess.setAttribute("user", authUser);
		return user;
	}else { 
		return null;
	}
	}
}
