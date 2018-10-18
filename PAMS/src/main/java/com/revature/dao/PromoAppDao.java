package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.pojos.PromoApp;
import com.revature.pojos.User;
import com.revature.util.SessionUtil;

public abstract class PromoAppDao implements Dao<PromoApp, Integer> {

	private static Session currentSession;
	
	 public void persist(PromoApp p) {
	        getCurrentSession().persist(p);
	    }

	    public void update(PromoApp p) {
	        getCurrentSession().update(p);
	        
	    }
	    
	    public void save(PromoApp p) {
	        getCurrentSession().save(p);
	    }

	    public void delete(PromoApp p) {
	        getCurrentSession().delete(p);
	    }
	    
	    public PromoApp findById(Integer id) {
	    	PromoApp p = (PromoApp) getCurrentSession().get(PromoApp.class, id);
	        return p;
	    }
	    
	    public static List<PromoApp> findAll() {
	        List<PromoApp> promoList= (List<PromoApp>) getCurrentSession().createQuery("from promoapp").list();
	        return promoList;
	    }
	    
	    public List<PromoApp> findByUserId(Integer userId){
	        Session sess = SessionUtil.getSession();
	        
	        String hql = "FROM promoapp as p WHERE p.userid= :userid";
	        
	        Query query = sess.createQuery(hql);
	        query.setParameter("userid", userId);
	        List<PromoApp> p = query.list();
	        
	        return p;
	    }
	    
	    public void deleteAll() {
	        List<PromoApp> promoList = findAll();
	        for (PromoApp p : promoList) {
	            delete(p);
	        }
	        
	    }
	    
	    public static Session getCurrentSession() {
	        return currentSession;
	    }
}
