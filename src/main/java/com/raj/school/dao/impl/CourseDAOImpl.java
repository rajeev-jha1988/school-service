package com.raj.school.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.raj.school.dao.CourseDao;
import com.raj.school.model.Course;


@Repository
public class  CourseDAOImpl extends UniDaoImpl<Course, Integer> implements CourseDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	protected Class<Course> getModelClass() {
		return Course.class;
	}

}
