/**
 * 
 */
package com.raj.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.school.model.Student;
import com.raj.school.service.StudentService;

/**
 * @author rajeev
 *
 */
@RestController
public class SchoolHandler {

	@Autowired
	private StudentService studentSerive;
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> students= studentSerive.getAllStudent();

		if(students !=null  ) {
			return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);
		}

	}
	
	@PutMapping("/createStudent")
	public ResponseEntity<Student> createStudent(Student student) {
		Student studentRes=	studentSerive.saveStudent(student);
		return new ResponseEntity<Student>(studentRes, HttpStatus.CREATED);
	}
	
	
}
