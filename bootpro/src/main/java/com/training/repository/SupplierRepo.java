package com.training.repository;

import com.training.model.Supplier;
/*
 * methods to implement supplier service logic
 */
public interface SupplierRepo {

	public int addSupplier(Supplier supplier);
	public int  updateSupplier(int supplierId,float amount);
	public int removeSupplier(int supplierId);

}