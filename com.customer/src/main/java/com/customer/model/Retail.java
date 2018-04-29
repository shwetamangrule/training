package com.customer.model;

public class Retail {

	public String retailName;
	public Address retailAddress;
	/**
	 * 
	 */
	public Retail() {
		super();
	}
	/**
	 * @param retailName
	 * @param retailAddress
	 */
	public Retail(String retailName, Address retailAddress) {
		super();
		this.retailName = retailName;
		this.retailAddress = retailAddress;
	}
	/**
	 * @return the retailName
	 */
	public String getRetailName() {
		return retailName;
	}
	/**
	 * @param retailName the retailName to set
	 */
	public void setRetailName(String retailName) {
		this.retailName = retailName;
	}
	/**
	 * @return the retailAddress
	 */
	public Address getRetailAddress() {
		return retailAddress;
	}
	/**
	 * @param retailAddress the retailAddress to set
	 */
	public void setRetailAddress(Address retailAddress) {
		this.retailAddress = retailAddress;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Retail [retailName=" + retailName + ", retailAddress=" + retailAddress + "]";
	}
	
}
