package controller;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Repository.CustomerRepo;
import Repository.CustomerRepoImpl;
import Repository.GoodsRepo;
import Repository.GoodsRepoImpl;
import Repository.RetailerRepo;
import Repository.RetailerRepoImpl;
import Repository.SupplierRepo;
import Repository.SupplierRepoImpl;
import Service.CustomerService;
import Service.CustomerServiceImpl;
import Service.GoodsService;
import Service.GoodsServiceImpl;
import Service.RetailerService;
import Service.RetailerServiceImpl;
import Service.SupplierService;
import Service.SupplierServiceImpl;

@Configuration
@ComponentScan(basePackages="com.cg")
@PropertySource(value= {"classpath:application.properties"})
public class ConfigApp {
	@Autowired
	Environment environment;
	@Bean(name="dataSource")
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		/*dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/scm");
		dataSource.setUsername("root");
		dataSource.setPassword("root");*/
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName") );
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
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
	
	@Bean(name="oodsService")
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

	@Bean(name="RetailerRepo")
	public RetailerRepo retailerRepo()
	{
		RetailerRepo retailerRepo=new RetailerRepoImpl(jdbctemplate());
		return retailerRepo;
	}
	
	@Bean(name="RetailerService")
	public RetailerService retailerService()
	{
		RetailerService retailerService=new RetailerServiceImpl(retailerRepo());
		return retailerService;
	}
}
