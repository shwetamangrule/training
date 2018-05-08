package model;

public class Address {
	
	public String street;
	public String houseNumber;
	public String zipCode;
	public String city;

	/**
	 * this method get the name of street
	 */
	public String getStreet() {
		return street;
	}
	
	/*
	 *this method set the name of street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 *this method get the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * this method set houseNumber
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	/**
	 *this method get the zip code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * this method set the zipcode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	/**
	 *this method get the name of city
	 */
	public String getCity() {
		return city;
	}

	/**
	 *this method set the name of city
	 */
	public void setCity(String city) {
		this.city = city;
	}

}