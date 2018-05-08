package com.training.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;
@Repository
public class RetailerRepoImpl implements RetailerRepo {
	@Autowired
	JdbcTemplate jdbcTemplate;
/*
 * jdbc template for creating connections
 */
//	public RetailerRepoImpl(JdbcTemplate jdbcTemplate) {
//		
//		super();
//		this.jdbcTemplate = jdbcTemplate;
//	}
	/*
	 * (non-Javadoc)
	 * @see Repository.RetailerRepo#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {

		List<Goods> goodslist = jdbcTemplate
				.query("SELECT * from goods",new BeanPropertyRowMapper<Goods>(Goods.class));
		return goodslist;
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.RetailerRepo#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {

		List<Customer> customerlist = jdbcTemplate.query("SELECT * from customer",new BeanPropertyRowMapper<Customer>(Customer.class));
		return customerlist;
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.RetailerRepo#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

		List<Supplier> supplierlist = jdbcTemplate.query("SELECT * FROM supplier",new BeanPropertyRowMapper<Supplier>(Supplier.class));

		return supplierlist;

	}



}