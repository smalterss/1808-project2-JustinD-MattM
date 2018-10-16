package com.revature.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.User;
import com.revature.services.UserServices;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class LoginController {
	private UserServices userServices;
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginGet(HttpSession sess){
		System.out.println("Working its fucking working~~!!!@@@!#@!@@@#");
		if (sess.getAttribute("user") != null) {
			return "home";
		}else {
			return "login";
		}
		
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginPost(User user, HttpSession sess) {
		System.out.println("Posting biattcchchhchchhc");
		System.out.println(user);
	User authUser = userServices.verifyUser(user);
	if (authUser != null) {
		sess.setAttribute("user", authUser);
		return "home";
	}else { 
		return "login";
	}
	}
}
