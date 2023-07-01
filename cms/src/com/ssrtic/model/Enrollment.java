package com.ssrtic.model;

public class Enrollment {
	
	private String enrollment_id;
	private String student_id;
	private String course_id;
	private String fess_status;
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrollment(String enrollment_id, String student_id, String course_id, String fess_status) {
		super();
		this.enrollment_id = enrollment_id;
		this.student_id = student_id;
		this.course_id = course_id;
		this.fess_status = fess_status;
	}
	public String getEnrollment_id() {
		return enrollment_id;
	}
	public void setEnrollment_id(String enrollment_id) {
		this.enrollment_id = enrollment_id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getFess_status() {
		return fess_status;
	}
	public void setFess_status(String fess_status) {
		this.fess_status = fess_status;
	}
	
	

}
