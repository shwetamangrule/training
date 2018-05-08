package com.training.services;

import com.training.model.Supplier;
/*
 * supplier service interface
 */
public interface SupplierService {

	public int addSupplier(Supplier supplier);
	public int updateSupplier(int supplierId,float amount);
	public int removeSupplier(int supplierId);

}