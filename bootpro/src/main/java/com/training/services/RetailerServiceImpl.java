package com.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;
import com.training.repository.RetailerRepo;
@Service
public class RetailerServiceImpl implements RetailerService{
@Autowired
	public RetailerRepo retailerRepo;
//	public RetailerServiceImpl(RetailerRepo retailerRepo) {
//		super();
//		this.retailerRepo = retailerRepo;
//	}
	/*
	 * (non-Javadoc)
	 * @see Service.RetailerService#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {
		return retailerRepo.viewGoods();
	}
	/*
	 * (non-Javadoc)
	 * @see Service.RetailerService#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {
		return retailerRepo.viewCustomer();
	}
	/*
	 * (non-Javadoc)
	 * @see Service.RetailerService#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

			return retailerRepo.viewSupplier();
	}



	



}