package com.customer.model;


/*
 * to set and get the customer details
 */
public class Customer {
	
	public Integer customerId;
	public String customerName;
	public Address customerAddress;
	public String paymentMethod;

	/*
	 * to get customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/*
	 * to set customer id
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/*
	 * to get customer name
	 */
	public String getCustomerName() {
		return customerName;
	}
	/*
	 * to set customer name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/*
	 * to get full address od customer
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}
	/*
	 * to set full address of customer
	 */
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	/*
	 * to get payment methods
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}
	/*
	 * to set payment methods
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Customer()
	{
		
	}
	
	public Customer(Integer customerId,String customerName,Address customerAddress,String paymentMethod)
	{
		this.customerId = customerId;
		this.customerAddress = customerAddress;
		this.customerName = customerName;
		this.paymentMethod = paymentMethod;

	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", paymentMethod=" + paymentMethod + "]";
	}
}
