package com.raj.school.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Formula;


import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DOB")
	private Date dob;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DOJ")
	private Date doj;

	@Column(name="FNAME")
	private String fname;

	@Column(name="LASTNAME")
	private String lastname;

	@Column(name="MIDNAME")
	private String midname;

	private String phone;

	@Column(name="SESSION")
	private String session;
	
	@Formula(" FNAME+MIDNAME+LASTNAME ")
	private String fullName;

	//bi-directional many-to-many association to Course
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="course_has_student"
		, joinColumns={
			@JoinColumn(name="student_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="course_ID")
			}
		)
	private Set<Course> courses;

	public Student() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return this.doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMidname() {
		return this.midname;
	}

	public void setMidname(String midname) {
		this.midname = midname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public String getFullName() {
		return fullName;
	}
	
	

}