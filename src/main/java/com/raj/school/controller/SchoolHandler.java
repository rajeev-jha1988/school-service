/**
 * 
 */
package com.raj.school.controller;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.school.dto.StudentDto;
import com.raj.school.model.Student;
import com.raj.school.service.StudentService;

/**
 * @author rajeev
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class SchoolHandler {

	@Autowired
	private StudentService studentSerive;
	
	@Autowired
	private DozerBeanMapper dozerMapper;
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<StudentDto>> getAllStudent() {
		List<Student> students= studentSerive.getAllStudent();
		List<StudentDto>  studentDtos = new ArrayList<>();
		for (Student student : students) {
			StudentDto studentDto = new StudentDto();
			dozerMapper.map(student, studentDto, "studentDto");
			studentDtos.add(studentDto);
		}
		if(students !=null  ) {
			return new ResponseEntity<List<StudentDto>>(studentDtos, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<StudentDto>>(studentDtos, HttpStatus.NO_CONTENT);
		}

	}
	
	@PutMapping("/createStudent")
	public ResponseEntity<Student> createStudent(Student student) {
		Student studentRes=	studentSerive.saveStudent(student);
		return new ResponseEntity<Student>(studentRes, HttpStatus.CREATED);
	}
	
	
}
