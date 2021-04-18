package main.java.com.campfhir.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.ScrollableResults;

import main.java.com.campfhir.model.DocumentReference;

/**
*
* @author  James Champion
* @version 1.0
* @since   2021-02-22 
*/
public interface DocumentReferenceDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public ScrollableResults findAll();
	
	public List<DocumentReference> findByPatientId(String id);
	
	public void deleteAll();
	
}
