package com.revature.dao;

import java.io.Serializable;
import java.util.List;



public interface Dao <T, Id extends Serializable>{

    public void persist(T t);
    
    public void update(T entity);
    
    public void save(T t);

    public T findById(Id id);

    public void delete(T entity);


    public void deleteAll();
}