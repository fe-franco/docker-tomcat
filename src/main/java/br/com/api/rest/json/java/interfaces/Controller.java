package br.com.api.rest.json.java.interfaces;

import java.util.List;

/**
 * Interface responsible for defining the default behavior offered to the API's
 * control classes.
 * 
 * @param <T> the data type to be used in the API interaction
 */
public interface Controller<T> {

	/**
	 * Method responsible for saving an object.
	 * 
	 * @param object the object to be persisted
	 */
	public void save(T object);

	/**
	 * Method responsible for updating an object.
	 * 
	 * @param object the object to be persisted
	 */
	public void merge(T object);

	/**
	 * Method responsible for removing an object.
	 * 
	 * @param object the object to be persisted
	 */
	public void remove(T object);

	/**
	 * Method responsible for returning a list of objects from the API.
	 * 
	 * @return a list of objects of the specified type
	 */
	public List<T> findAll();

	/**
	 * Method responsible for returning an object by its ID.
	 * 
	 * @param ID the ID of the object to be returned
	 * @return an object of the specified type
	 */
	public T findByID(Long ID);
}
