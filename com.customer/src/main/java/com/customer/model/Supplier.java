package com.customer.model;

public class Supplier {
	
	public Integer supplierId;
	public String supplierName;
	public Address supplierAddress;
	public Integer quantity;
	public Integer orderId;
	public long ammount;
	
	/**
	 * @return the supplierId
	 */
	public Integer getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}
	
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return the address
	 */
	public Address getsupplierAddress() {
		return supplierAddress;
	}
	/**
	 * @param address the address to set
	 */
	public void setsupplierAddress(Address supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the ammount
	 */
	public long getAmmount() {
		return ammount;
	}
	/**
	 * @param ammount the ammount to set
	 */
	public void setAmmount(long ammount) {
		this.ammount = ammount;
	}

	/**
	 * default constructor
	 */
	public Supplier() {
		super();
	}
	/**
	 * @param supplierId
	 * @param supplierName
	 * @param address
	 * @param quantity
	 * @param orderId
	 * @param ammount
	 */
	public Supplier(Integer supplierId, String supplierName, Address supplierAddress, Integer quantity, Integer orderId,
			long ammount) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.quantity = quantity;
		this.orderId = orderId;
		this.ammount = ammount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", quantity=" + quantity + ", orderId=" + orderId + ", ammount=" + ammount + "]";
	}
}
