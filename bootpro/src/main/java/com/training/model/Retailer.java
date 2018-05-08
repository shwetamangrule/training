package com.training.model;
public class Retailer {
	
	public int retailerId;
	public String retailerName;
	public String retailerAddress;
	/**
	 * @return the retailerId
	 */
	public int getRetailerId() {
		return retailerId;
	}
	/**
	 * @param retailerId the retailerId to set
	 */
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}
	/**
	 * @param retailerName the retailerName to set
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	/**
	 * @return the retailerAddress
	 */
	public String getRetailerAddress() {
		return retailerAddress;
	}
	/**
	 * @param retailerAddress the retailerAddress to set
	 */
	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}
	/**
	 * 
	 */
	public Retailer() {
		super();
	}
	/**
	 * @param retailerId
	 * @param retailerName
	 * @param retailerAddress
	 */
	public Retailer(int retailerId, String retailerName, String retailerAddress) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}
	
}