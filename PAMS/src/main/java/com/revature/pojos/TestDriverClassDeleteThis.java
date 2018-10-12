package com.revature.pojos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.services.UserServices;
import com.revature.util.SessionUtil;

public class TestDriverClassDeleteThis {

	public static void main(String[] args) {
		Session sess = SessionUtil.getSession();
		UserServices us = new UserServices();
//		
//		Criteria criteria = sess.createCriteria(User.class);
//		
//		List<User> users = criteria.add(Restrictions.eq("emailAddress", "wreog@rev.com")).list();
//		
//		for(User u : users) {
//			User newguy = u;
//			System.out.println(newguy);
//		}
		System.out.println(us.verifyEmail("wreog@rev.com"));
		
		
//		System.out.println(sess.get(User.class, 1));
//		String hql = "FROM User WHERE emailAddress = :email";
//		Criteria criteria = sess.createCriteria(User.class);
//		List<User> users= criteria.add(Restrictions.ge("emailAddress", "wreog@rev.com")).list();
//		
//		System.out.println(users);
		
		
//		query.setParameter("email", "wreog@rev.com");
//		User user = (User) query.;
//		System.out.println(user);
	}

}
