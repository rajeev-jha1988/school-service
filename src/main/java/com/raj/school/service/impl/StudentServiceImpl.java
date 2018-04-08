package com.raj.school.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.school.dao.StudentDao;
import com.raj.school.model.Student;
import com.raj.school.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDAO;

	@Override
	public List<Student> getAllStudent() {

		return studentDAO.findAll(10, 0);
	}
	@Override
	public Student saveStudent(Student model) {
		studentDAO.createRecord(model);
		return model;

	}
	@Override
	public void updateStudent(Student model) {
		studentDAO.updateRecord(model);
	}

}
