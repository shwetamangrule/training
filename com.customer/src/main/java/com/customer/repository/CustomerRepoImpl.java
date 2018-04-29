package com.customer.repository;

import java.util.HashMap;
import java.util.Map;

import com.customer.model.Customer;
import com.customer.model.Goods;
import com.customer.model.Retail;
import com.customer.model.Supplier;

public class CustomerRepoImpl implements CustomerRepo{

	
	Map<Integer,Customer> customerTab=new HashMap<>();
	Map<Integer,Goods> goodsTab=new HashMap<>();
	Map<Integer,Retail> retailTab=new HashMap<>();
	Map<Integer,Supplier> supplierTab=new HashMap<>();
	
	@Override
	public int addGoods(Goods goods)
	{
		goodsTab.put(goods.getGoodsId(), goods);
		return 1;
	}
	@Override
	public int removeGoods(Goods goods)
	{
		goodsTab.remove(goods.getGoodsId());
		return 1;
	}

	

	@Override
	public int orderGoods() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGoods(Goods goods) {
		goodsTab.replace(goods.getGoodsId(),goods);
		return 1;
	}

	@Override
	public int addSupplier(Supplier supplier) {
		supplierTab.put(supplier.getSupplierId(), supplier);
		return 1;
	}

	@Override
	public int removeSupplier(Supplier supplier) {
		supplierTab.remove(supplier.getSupplierId());
		return 1;
	}

	@Override
	public int updateSupplier(Supplier supplier) {
		supplierTab.replace(supplier.getSupplierId(),supplier);
		return 1;
	}

	@Override
	public int addCustomer(Customer customer) {
		customerTab.put(customer.getCustomerId(),customer);
		return 1;
	}

	@Override
	public int removeCustomer(Customer customer) {
		customerTab.remove(customer.getCustomerId());
		return 1;
	}

	@Override
	public int updateCustomer(Customer customer) {
		customerTab.replace(customer.getCustomerId(),customer);
		return 1;
	}

	@Override
	public Map<Integer, Goods> viewGoods() {
		return goodsTab;
	}

	@Override
	public Map<Integer, Supplier> viewSupplier() {
		return supplierTab;
	}

	@Override
	public Map<Integer, Customer> viewCustomer() {
		return customerTab;
	}
	


}
