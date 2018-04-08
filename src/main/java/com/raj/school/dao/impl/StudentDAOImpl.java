package com.raj.school.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.raj.school.dao.StudentDao;
import com.raj.school.model.Student;

@Repository
public class StudentDAOImpl extends UniDaoImpl<Student, Integer> implements StudentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	protected Class<Student> getModelClass() {
		return Student.class;
	}

}
