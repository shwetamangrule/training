package com.customer.model;
/*
 * Sets and returns the address
 */

public class Address {

	public String street;	
	public String zipCode;	
	public String city;
/*
 * to get the Street name
 */
	public String getStreet() {
		return street;
	}
/*
 * to set the street name
 */
	public void setStreet(String street) {
		this.street = street;
	}
/*
 * to get the zipcode
 */
	public String getZipCode() {
		return zipCode;
	}
/*
 * to get the zipcode
 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
/*
 * to get the city
 */
	public String getCity() {
		return city;
	}
/*
 * to set the city
 */
	public void setCity(String city) {
		this.city = city;
	}
/*
 * default no parameter constructor
 */
	public Address() {
	}
	/*
	 * parameterized constructor
	 */
	public 	Address(String street, String zipCode, String city) {

		this.street=street;
		this.zipCode = zipCode;
		this.city = city;

	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", zipCode=" + zipCode + ", city=" + city + "]";
	}
}
