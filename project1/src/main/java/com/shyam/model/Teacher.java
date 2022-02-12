package com.shyam.model;

public class Teacher {
	
	private String teacherid, teachername, subject, classid;

	public Teacher() {
		super();
	}

	public Teacher(String teacherid, String teachername, String subject, String classid) {
		super();
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.subject = subject;
		this.classid = classid;
	}

	public String getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}
	
	

}
