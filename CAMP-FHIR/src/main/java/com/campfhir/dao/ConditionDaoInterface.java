package main.java.com.campfhir.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.ScrollableResults;

import main.java.com.campfhir.model.Condition;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public interface ConditionDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public ScrollableResults findAll();
	
	public List<Condition> findByPatientId(String id);
	
	public void deleteAll();
	
}
