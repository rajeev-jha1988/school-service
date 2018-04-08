/**
 * 
 */
package com.raj.school.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;

import com.raj.school.dao.UniDao;



/**
 * @author rajeev
 *
 */
public abstract class UniDaoImpl<T,E extends Serializable> implements UniDao<T,E> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Accessor method for Entity manager
	 * 
	 * @return Autowired Entity manager object
	 */
	protected abstract EntityManager getEntityManager();
	
	/**
	 * Accessor method for Model class
	 * 
	 * @return Respective Model class
	 */
	protected abstract Class<T> getModelClass();

	@Override
	@SuppressWarnings("unchecked")
	public E createRecord(T model)  {
		E pk = null;
			Session session = getEntityManager().unwrap(Session.class);
			pk = (E) session.save(model);
		return pk;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void updateRecord(T model) {
		
		Session session = getEntityManager().unwrap(Session.class);
		model = (T) session.merge(model);
		session.saveOrUpdate(model);
	}

	@Override
	public void deleteRecord(T model)  {
		EntityManager em = getEntityManager();
		em.remove(em.contains(model)?model:em.merge(model));
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll(int fetchSize, int fetchCount)  {
		List<T> returnList = new ArrayList<T>();
		Session session = getEntityManager().unwrap(Session.class);
		Query managerQuery = session.createQuery(" from " + getModelClass().getSimpleName() + " t");
		managerQuery.setMaxResults(fetchSize);
		managerQuery.setFirstResult(fetchSize * fetchCount);
		returnList = managerQuery.list();
		return returnList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T findByPrimaryKey(E pk)  {
		T returnModel = null;
			Session session = getEntityManager().unwrap(Session.class);
			returnModel = (T) session.get(getModelClass(), pk);
			
		
		return returnModel;
	}
}
