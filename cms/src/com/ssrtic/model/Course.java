package com.ssrtic.model;

public class Course {

	private String course_id;
	private String course_name;
	private  String course_coordinator;
	private String department;
	private double course_fee;
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Course(String course_id, String course_name, String course_coordinator, String department,
			double course_fee) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_coordinator = course_coordinator;
		this.department = department;
		this.course_fee = course_fee;
	}



	public String getCourse_id() {
		return course_id;
	}



	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}



	public String getCourse_name() {
		return course_name;
	}



	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}



	public String getCourse_coordinator() {
		return course_coordinator;
	}



	public void setCourse_coordinator(String course_coordinator) {
		this.course_coordinator = course_coordinator;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public double getCourse_fee() {
		return course_fee;
	}



	public void setCourse_fee(double course_fee) {
		this.course_fee = course_fee;
	}
	
	
	
	
}
