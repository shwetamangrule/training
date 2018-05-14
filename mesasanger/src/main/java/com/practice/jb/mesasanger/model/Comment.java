package com.practice.jb.mesasanger.model;

import java.util.Date;

public class Comment {

	private Integer id;
	private String message;
	private Date date;
	private String author;
	public Comment(Integer id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.date=new Date();
	}
	public Comment() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
