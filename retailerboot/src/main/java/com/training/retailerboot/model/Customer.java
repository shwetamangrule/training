package com.training.retailerboot.model;

public class Customer {

	private Integer customer_Id;
	private String customer_name;
	private String customer_address;
	/**
	 * @param customer_Id
	 * @param customer_name
	 * @param customer_address
	 */
	public Customer(Integer customer_Id, String customer_name, String customer_address) {
		super();
		this.customer_Id = customer_Id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	/**
	 * @return the customer_Id
	 */
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	/**
	 * @param customer_Id the customer_Id to set
	 */
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}
	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	/**
	 * @return the customer_address
	 */
	public String getCustomer_address() {
		return customer_address;
	}
	/**
	 * @param customer_address the customer_address to set
	 */
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

}
