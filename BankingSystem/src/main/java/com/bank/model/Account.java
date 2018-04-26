package com.bank.model;
public class Account extends Statement {
	private float balance;
	private float interestRate;
	private float interestPeriod;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public float getInterestPeriod() {
		return interestPeriod;
	}
	public void setInterestPeriod(float interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
}