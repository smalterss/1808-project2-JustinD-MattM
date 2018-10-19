package com.revature.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.PromoApp;
import com.revature.services.PromoAppServices;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
<<<<<<< HEAD
@CrossOrigin(origins="http://localhost:4200")
=======
>>>>>>> 6adb4ccd18906870b75c074545f5851aa6a5fe06
public class PromoAppController {
	private PromoAppServices pas;

	@CrossOrigin
	@RequestMapping(value = "/promo-app", method = RequestMethod.POST, consumes= {"application/json"})
	public void promoAppPost(@RequestBody PromoApp p, HttpSession sess) {
		System.out.println("Inside of the POST method in Promo App Controller");
		System.out.println(p);
		
	}
}
