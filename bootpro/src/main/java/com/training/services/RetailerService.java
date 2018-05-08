package com.training.services;

import java.util.List;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;
/*
 * retailer seervice logic
 */
public interface RetailerService {

	public List<Goods> viewGoods();
	public List<Customer> viewCustomer();
	public List<Supplier> viewSupplier();

}