package com.ssrtic.model;

import java.util.Date;

public class Payment {
	private String payment_id;
	private String enroll_id;
	private Date payment_date;
	private String payment_mode;
	private double amount;
	
	
	
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Payment(String payment_id, String enroll_id, Date payment_date, String payment_mode, double amount) {
		super();
		this.payment_id = payment_id;
		this.enroll_id = enroll_id;
		this.payment_date = payment_date;
		this.payment_mode = payment_mode;
		this.amount = amount;
	}
	
	
	
	
	
	public String getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	public String getEnroll_id() {
		return enroll_id;
	}
	public void setEnroll_id(String enroll_id) {
		this.enroll_id = enroll_id;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
