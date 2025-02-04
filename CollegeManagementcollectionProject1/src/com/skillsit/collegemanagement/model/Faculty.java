package com.skillsit.collegemanagement.model;

public class Faculty {
	
	private int id;
	private String fname;
	private Course course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", fname=" + fname + ", course=" + course + "]";
	}
	
	
	

}
