package com.shyam.model;

public class Student {
	
	private String studentid, firstName, lastName, clsid;

	public Student() {
		super();
	}

	public Student(String studentid, String firstName, String lastName, String clsid) {
		super();
		this.studentid = studentid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.clsid = clsid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClsid() {
		return clsid;
	}

	public void setClsid(String clsid) {
		this.clsid = clsid;
	}
	
	
	
	

}
