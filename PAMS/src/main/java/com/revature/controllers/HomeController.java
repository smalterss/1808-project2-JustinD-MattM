package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.UserServices;

@RestController

public class HomeController {
	private UserServices userServices;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String loginGet(HttpSession sess) {
		System.out.println("Inside of the Get method in home Controllers");
		return null;
		

	}
}
