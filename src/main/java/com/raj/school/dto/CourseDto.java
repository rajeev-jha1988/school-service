package com.raj.school.dto;

import java.util.Set;


public class CourseDto {
	private int id;
	private String coursename;
	private String duration;
	private Set<StudentDto> studentDtos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Set<StudentDto> getStudentDtos() {
		return studentDtos;
	}
	public void setStudentDtos(Set<StudentDto> studentDtos) {
		this.studentDtos = studentDtos;
	}
	@Override
	public String toString() {
		return "CourseDto [id=" + id + ", coursename=" + coursename + ", duration=" + duration + ", studentDtos="
				+ studentDtos + "]";
	}
	

}
