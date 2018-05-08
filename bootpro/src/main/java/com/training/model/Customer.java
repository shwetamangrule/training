package com.training.model;

public class Customer

{
	public int customerId;
	public String customerName;
	public String customerAddress;
	public String paymentMode;
	public int retailerId;

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
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
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param paymentMode
	 * @param retailerId
	 */
	public Customer(int customerId, String customerName, String customerAddress, String paymentMode,
			int retailerId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
		this.retailerId = retailerId;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	
}