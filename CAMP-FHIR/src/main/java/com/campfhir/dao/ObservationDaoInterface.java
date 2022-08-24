package main.java.com.campfhir.dao;

import java.io.Serializable;

import org.hibernate.ScrollableResults;


public interface ObservationDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public ScrollableResults findAllLab();
	
	public void deleteAll();
	
}
