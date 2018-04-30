package com.bank.model;
public class Contact extends Address{
	
	private String email;
	private String mobile;
	private String phone;
	
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	public String getPhone() {
		return phone;
	}
	public Contact() {
		super();
	}
	public Contact(String phone, String mobile, String email) {
		super();
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", mobile=" + mobile + ", email=" + email + "]";
	}
}