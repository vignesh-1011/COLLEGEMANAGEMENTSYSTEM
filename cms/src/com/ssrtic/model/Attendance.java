package com.ssrtic.model;

public class Attendance {
 
	private String attendance_id;
	private String student_id;
	private String enroll_id;
	private int semester;
	private int total_working_days;
	private int present_days;
	private int absent_days;
	private int attenance_percentage;

	public Attendance() {
		super();
	}

	public Attendance(String attendance_id, String student_id, String enroll_id, int semester,
			int total_working_days, int present_days, int absent_days, int attenance_percentage) {
		super();
		this.attendance_id = attendance_id;
		this.student_id = student_id;
		this.enroll_id = enroll_id;
		this.semester = semester;
		this.total_working_days = total_working_days;
		this.present_days = present_days;
		this.absent_days = absent_days;
		this.attenance_percentage = attenance_percentage;
	}
	
	public String getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(String attendance_id) {
		this.attendance_id = attendance_id;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getEnroll_id() {
		return enroll_id;
	}
	public void setEnroll_id(String enroll_id) {
		this.enroll_id = enroll_id;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getTotal_working_days() {
		return total_working_days;
	}
	public void setTotal_working_days(int total_working_days) {
		this.total_working_days = total_working_days;
	}
	public int getPresent_days() {
		return present_days;
	}
	public void setPresent_days(int present_days) {
		this.present_days = present_days;
	}
	public int getAbsent_days() {
		return absent_days;
	}
	public void setAbsent_days(int absent_days) {
		this.absent_days = absent_days;
	}
	public int getAttenance_percentage() {
		return attenance_percentage;
	}
	public void setAttenance_percentage(int attenance_percentage) {
		this.attenance_percentage = attenance_percentage;
	}
	
	
	
	
}
