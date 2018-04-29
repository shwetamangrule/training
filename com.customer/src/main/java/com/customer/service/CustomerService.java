package com.customer.service;

import java.util.Map;

import com.customer.model.Customer;
import com.customer.model.Goods;
import com.customer.model.Supplier;

public interface CustomerService {

	public int addGoods(Goods goods);
	public int removeGoods(Goods goods);
	public int orderGoods();
	public int updateGoods(Goods goods);
	
	public int addSupplier(Supplier supplier);
	public int removeSupplier(Supplier supplier);
	public int updateSupplier(Supplier supplier);
	
	public int addCustomer(Customer customer);
	public int removeCustomer(Customer customer);
	public int updateCustomer(Customer customer);
	
	public Map<Integer,Goods> viewGoods();
	public Map<Integer,Supplier> viewSupplier();
	public Map<Integer,Customer> viewCustomer();
}
