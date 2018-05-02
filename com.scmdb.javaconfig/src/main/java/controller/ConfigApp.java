package controller;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Repository.CustomerRepo;
import Repository.CustomerRepoImpl;
import Service.CustomerService;
import Service.CustomerServiceImpl;

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

}
