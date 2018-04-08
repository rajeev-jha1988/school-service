package com.raj.school.service;

import java.util.List;

import com.raj.school.model.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	
	public Student saveStudent(Student model);
	public void updateStudent(Student model);
}
