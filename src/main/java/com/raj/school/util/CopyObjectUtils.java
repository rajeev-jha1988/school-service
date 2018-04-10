package com.raj.school.util;

import org.springframework.beans.BeanUtils;

import com.raj.school.dto.StudentDto;
import com.raj.school.model.Student;

public class CopyObjectUtils {

	public static StudentDto  copyObjectDto(Student source,StudentDto target){
		BeanUtils.copyProperties(source, target);
		return target;
	}
}
