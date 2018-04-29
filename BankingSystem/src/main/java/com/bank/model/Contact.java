package com.bank.model;
public class Contact extends Address{
	
	private String phone;
	private String mobile;
	private String email;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", mobile=" + mobile + ", email=" + email + "]";
	}
}