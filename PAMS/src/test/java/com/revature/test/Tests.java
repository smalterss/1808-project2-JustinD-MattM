package com.revature.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.revature.pojos.User;
import com.revature.services.UserServices;

public class Tests {
	
/*
 * Tests for the Use
 */
	
	
	
/*
 * Tests for the UserServices Class
 */
	@Test
	public void verifyEmailTest() {
		assertTrue(UserServices.verifyEmail("jld@rev.com"));
	}
	
	@Test
	public void verifyPasswordTest() {
		assertTrue(UserServices.verifyPassword("jld@rev.com", "pass"));
	}
	
	@Test
	public void verifyGetUserTest() {
		User user = UserServices.verifyUser("jld@rev.com", "pass");
		boolean answer = false;
		if(user != null) {
			answer = true;
		}
		assertTrue(answer);
		
	}

}
