package com.revature.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.revature.pojos.User;

public abstract class UserDao implements Dao<User, Integer> {

	private static Session currentSession;
	private Transaction currentTransaction;
		
	public void persist(User user) {
		getCurrentSession().persist(user);
	}

	public void update(User user) {
		getCurrentSession().update(user);
		
	}

	public User findById(Integer id) {
		User user = (User) getCurrentSession().get(User.class, id);
		return user;
	}
	
	public static User findByEmail(String email) {
		User user = (User) getCurrentSession().get(User.class, email);
		return user;
	}

	public void delete(User user) {
		getCurrentSession().delete(user);
	}

	public static List<User> findAll() {
		List<User> users= (List<User>) getCurrentSession().createQuery("from user").list();
		return users;
	}

	public void deleteAll() {
		List<User> userList = findAll();
		for (User u : userList) {
			delete(u);
		}
		
	}
	
	public static Session getCurrentSession() {
		return currentSession;
	}


}
