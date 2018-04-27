package com.bank.model;

public class Address {

	private static String street;
	private static String houseNumber;
	private static String zipCode;
	private static String city;

	public static String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public static String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public static String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public static String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public Address()
	{}
	// Parameterized constructor
	public Address(String street, String houseNumber, String zipCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}

	/*
	 * 
	 * @see java.lang.Object#toString()
	 * 
	 */
	@Override
	public String toString() {

		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zipCode=" + zipCode + ", city=" + city

				+ "]";

	}

}