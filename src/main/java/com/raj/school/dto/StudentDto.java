/**
 * 
 */
package com.raj.school.dto;

import java.util.Date;
import java.util.Set;



/**
 * @author rajeev
 *
 */
public class StudentDto {
	private int id;
	private Date dob;
	private Date doj;
	private String fname;
	private String lastname;
	private String midname;
	private String phone;
	private String session;
	private String fullName;
	private Set<CourseDto> coursesDto;

	public Set<CourseDto> getCoursesDto() {
		return coursesDto;
	}

	public void setCoursesDto(Set<CourseDto> coursesDto) {
		this.coursesDto = coursesDto;
	}

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

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", dob=" + dob + ", doj=" + doj + ", fname=" + fname + ", lastname=" + lastname
				+ ", midname=" + midname + ", phone=" + phone + ", session=" + session + ", fullName=" + fullName
				+ ", coursesDto=" + coursesDto + "]";
	}
	
	
	
	
}
