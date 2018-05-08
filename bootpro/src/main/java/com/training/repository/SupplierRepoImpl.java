package com.training.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.model.Supplier;
@Repository
public class SupplierRepoImpl implements SupplierRepo {
	@Autowired
	JdbcTemplate jdbcTemplate;
	/*
	 * jdbc template for connection
	 */
//	public SupplierRepoImpl(JdbcTemplate jdbcTemplate) {
//		super();
//		this.jdbcTemplate = jdbcTemplate;
//	}
	/*
	 * (non-Javadoc)
	 * @see Repository.SupplierRepo#addSupplier(model.Supplier)
	 */
	@Override
	public int addSupplier(Supplier supplier) {

		String query = "INSERT INTO supplier VALUES('"
				+ supplier.getSupplierId() + "','" + supplier.getSupplierName()
				+ "','" + supplier.getSupplierAddress() + "','"
				+ supplier.getQuantityOrder() + "','" + supplier.getOrderId()
				+ "','" + supplier.getAmount() + "','"
				+ supplier.getRetailerId() + "')";
		jdbcTemplate.update(query);
		return supplier.getSupplierId();
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.SupplierRepo#updateSupplier(int, float)
	 */
	@Override
	public int updateSupplier(int supplierId, float amount) {

		String query = "UPDATE supplier SET ammount='" + amount
				+ "' WHERE supplier_id='" + supplierId + "'";
		return jdbcTemplate.update(query);

	}
	/*
	 * (non-Javadoc)
	 * @see Repository.SupplierRepo#removeSupplier(int)
	 */
	@Override
	public int removeSupplier(int supplierId) {

		String query = "DELETE FROM supplier WHERE supplier_id='" + supplierId
				+ "'";
		return jdbcTemplate.update(query);

	}

}