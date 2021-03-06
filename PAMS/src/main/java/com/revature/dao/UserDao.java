package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.revature.pojos.User;
import com.revature.util.SessionUtil;

public abstract class UserDao implements Dao<User, Integer> {

    private static Session currentSession;
        
    public void persist(User user) {
        getCurrentSession().persist(user);
    }

    public void update(User user) {
        getCurrentSession().update(user);
        
    }
    
    public void save(User user) {
        getCurrentSession().save(user);
    }

    public User findById(Integer id) {
        User user = (User) getCurrentSession().get(User.class, id);
        return user;
    }
    
    public static User findByEmail(String email) {
  
        Session sess = SessionUtil.getSession();
        
        String hql = "FROM User as u WHERE u.emailAddress = :email";
        
        Query query = sess.createQuery(hql);
        query.setParameter("email", email);
        List<User> users = query.list();
        
        for(User u : users) {
            User newguy = u;
            System.out.println(newguy);
        }
        
        for(User u : users) {
            if (u != null) {
                return u;
            }
        }
                
        return null;
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