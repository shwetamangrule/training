package com.practice.jb.mesasanger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class errorMessage {

	private String errorMessage;
	private Integer errorcode;
	private String doc;
	public errorMessage() {
		super();
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public errorMessage(String errorMessage, Integer errorcode, String doc) {
		super();
		this.errorMessage = errorMessage;
		this.errorcode = errorcode;
		this.doc = doc;
	}
}
