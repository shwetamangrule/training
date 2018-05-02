package controller;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Repository.CustomerRepo;
import Repository.CustomerRepoImpl;
import Repository.GoodsRepo;
import Repository.GoodsRepoImpl;
import Repository.SupplierRepo;
import Repository.SupplierRepoImpl;
import Service.CustomerService;
import Service.CustomerServiceImpl;
import Service.GoodsService;
import Service.GoodsServiceImpl;
import Service.SupplierService;
import Service.SupplierServiceImpl;

@Configuration
public class ConfigApp {
	
	@Bean(name="dataSource")
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/scm");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean (name="jdbctemplate")
	public JdbcTemplate jdbctemplate()
	{
		JdbcTemplate jdbctemplate=new JdbcTemplate();
		jdbctemplate.setDataSource(dataSource());
		return jdbctemplate;
	}
	
	@Bean(name="customerRepo")
	public CustomerRepo customerRepo()
	{
		CustomerRepo customerRepo=new CustomerRepoImpl(jdbctemplate());
		return customerRepo;
	}
	
	@Bean(name="CustomerService")
	public CustomerService customerService()
	{
		CustomerService customerService=new CustomerServiceImpl(customerRepo());
		return customerService;
	}
	
	@Bean(name="GoodsRepo")
	public GoodsRepo goodsRepo()
	{
		GoodsRepo goodsRepo=new GoodsRepoImpl(jdbctemplate());
		return goodsRepo;
	}
	
	@Bean(name="GoodsService")
	public GoodsService goodsService()
	{
		GoodsService goodsService=new GoodsServiceImpl(goodsRepo());
		return goodsService;
	}
	
	@Bean(name="SupplierRepo")
	public SupplierRepo supplierRepo()
	{
		SupplierRepo supplierRepo=new SupplierRepoImpl(jdbctemplate());
		return supplierRepo;
	}
	
	@Bean(name="SupplierService")
	public SupplierService supplierService()
	{
		SupplierService supplierService=new SupplierServiceImpl(supplierRepo());
		return supplierService;
	}

}
