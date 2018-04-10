/**
 * 
 */
package com.raj.school.common;

import java.util.Date;

import com.raj.school.dto.CourseDto;


/**
 * @author rajeev
 *
 */
public class SchoolDto {
	
	private int id;
	private Date dob;
	private Date doj;
	private String fname;
	private String lastname;
	private String midname;
	private String phone;
	private String session;
	private String fullName;
	private CourseDto courseDto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMidname() {
		return midname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public CourseDto getCourseDto() {
		return courseDto;
	}
	public void setCourseDto(CourseDto courseDto) {
		this.courseDto = courseDto;
	}
	
}
