package com.ssrtic.model;

import java.util.Date;

public class Student {

	
	private String admission_number;
	private String student_id;
	private String student_name;
	private Date dob;
	private int year_of_study;
	private int year_of_joining;
	private int tenth_grade_mark;
	private int tewleth_grade_mark;
	private String first_graduate;
	private String email_id;
	private long phoneno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String admission_number, String student_id, String student_name, Date dob, int year_of_study,
			int year_of_joining, int tenth_grade_mark, int tewleth_grade_mark, String first_graduate, String email_id,
			long phoneno) {
		super();
		this.admission_number = admission_number;
		this.student_id = student_id;
		this.student_name = student_name;
		this.dob = dob;
		this.year_of_study = year_of_study;
		this.year_of_joining = year_of_joining;
		this.tenth_grade_mark = tenth_grade_mark;
		this.tewleth_grade_mark = tewleth_grade_mark;
		this.first_graduate = first_graduate;
		this.email_id = email_id;
		this.phoneno = phoneno;
	}
	public String getAdmission_number() {
		return admission_number;
	}
	public void setAdmission_number(String admission_number) {
		this.admission_number = admission_number;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getYear_of_study() {
		return year_of_study;
	}
	public void setYear_of_study(int year_of_study) {
		this.year_of_study = year_of_study;
	}
	public int getYear_of_joining() {
		return year_of_joining;
	}
	public void setYear_of_joining(int year_of_joining) {
		this.year_of_joining = year_of_joining;
	}
	public int getTenth_grade_mark() {
		return tenth_grade_mark;
	}
	public void setTenth_grade_mark(int tenth_grade_mark) {
		this.tenth_grade_mark = tenth_grade_mark;
	}
	public int getTewleth_grade_mark() {
		return tewleth_grade_mark;
	}
	public void setTewleth_grade_mark(int tewleth_grade_mark) {
		this.tewleth_grade_mark = tewleth_grade_mark;
	}
	public String getFirst_graduate() {
		return first_graduate;
	}
	public void setFirst_graduate(String first_graduate) {
		this.first_graduate = first_graduate;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	
	
}
