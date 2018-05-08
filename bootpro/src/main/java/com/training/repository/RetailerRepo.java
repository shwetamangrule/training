package com.training.repository;

import java.util.List;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;
/*
 * interface to implements retailer service logic
 */
public interface RetailerRepo {

	public List<Goods> viewGoods();
	public List<Customer> viewCustomer();
	public List<Supplier> viewSupplier();

}