package com.raj.school.service;

import java.util.List;

import com.raj.school.model.Course;
import com.raj.school.model.Student;

public interface CourseService {
	public List<Course> getAllCourse();
	public void saveCourse(Student e);
	public void updateCourse(Student e);
}
