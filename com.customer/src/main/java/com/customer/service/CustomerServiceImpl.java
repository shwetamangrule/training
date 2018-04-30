package com.customer.service;

import java.util.Map;

import com.customer.model.Customer;
import com.customer.model.Goods;
import com.customer.model.Supplier;
import com.customer.repository.CustomerRepo;
import com.customer.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService{

	CustomerRepo custRepo=new CustomerRepoImpl();

	@Override
	public int addGoods(Goods goods) {
		return custRepo.addGoods(goods);
	}

	@Override
	public int removeGoods(Goods goods) {
		return custRepo.removeGoods(goods);
	}

	@Override
	public int orderGoods() {
		return custRepo.orderGoods();
	}

	@Override
	public int updateGoods(Goods goods) {
		return custRepo.updateGoods(goods);
	}

	@Override
	public int addSupplier(Supplier supplier) {
		return custRepo.addSupplier(supplier);
	}

	@Override
	public int removeSupplier(Supplier supplier) {
		return custRepo.removeSupplier(supplier);
	}

	@Override
	public int updateSupplier(Supplier supplier) {
		return custRepo.updateSupplier(supplier);
	}

	@Override
	public int addCustomer(Customer customer) {
		return custRepo.addCustomer(customer);
	}

	@Override
	public int removeCustomer(Customer customer) {
		return custRepo.removeCustomer(customer);
	}

	@Override
	public int updateCustomer(Customer customer) {
		return custRepo.updateCustomer(customer);
	}

	@Override
	public Map<Integer, Goods> viewGoods() {
		return custRepo.viewGoods();
	}

	@Override
	public Map<Integer, Supplier> viewSupplier() {
		return custRepo.viewSupplier();
	}

	@Override
	public Map<Integer, Customer> viewCustomer() {
		return custRepo.viewCustomer();
	}
	

}
