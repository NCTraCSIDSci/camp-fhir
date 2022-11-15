package main.java.com.campfhir.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.ScrollableResults;

import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Patient;

/**
*
* @author  James Champion
* @version 1.0
* @since   2022-09-01 
*/
public interface ResourceDaoInterface<T, Id extends Serializable> 
{
	public void persist(T entity);
	
	public ScrollableResults findAll(Campfhir cf);
}
