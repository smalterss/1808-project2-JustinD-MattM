package com.revature.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.pojos.User;
import com.revature.services.UserServices;


@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private UserServices us = new UserServices();
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess){
		System.out.println("You made it to the GET method in Login Controller");
		User user = UserServices.verifyUser((String) sess.getAttribute("email"), (String) sess.getAttribute("password"));
		
		if(user != null) {
			return "home";
		}
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost(@Valid User user, BindingResult bindingResult, ModelMap modelMap, HttpSession sess){
		
		User authUser = us.verifyUser(user.getEmailAddress(), user.getPassword());
		if(authUser != null) {
			sess.setAttribute("user", authUser);
			return "home";
		}

		modelMap.addAttribute("errorMessage", "Username or password is inccorect");
		return "login";
	}
}
