package com.practice.jb.mesasanger.model;

import java.util.Date;

public class Profile {

	private Integer id;
	private String name;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Profile() {
		super();
	}
	public Profile(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.date=new Date();
	}
	
}
