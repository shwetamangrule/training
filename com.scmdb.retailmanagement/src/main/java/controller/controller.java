package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.CustomerService;
import Service.CustomerServiceImpl;
import Service.GoodsService;
import Service.GoodsServiceImpl;
import Service.RetailerService;
import Service.RetailerServiceImpl;
import Service.SupplierService;
import Service.SupplierServiceImpl;
import model.Customer;
import model.Goods;
import model.Retailer;
import model.Supplier;

public class controller {

	public static void main(String[] args) {

		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");

		final CustomerService customerService = appcontext.getBean("customerService", CustomerServiceImpl.class);
		final SupplierService supplierService = appcontext.getBean("supplierService", SupplierServiceImpl.class);
		final GoodsService goodsService = appcontext.getBean("goodsService", GoodsServiceImpl.class);
		final RetailerService retailerService = appcontext.getBean("retailerService", RetailerServiceImpl.class);

		Customer customer = new Customer(105, "Tuhin", "Wb", "credit", 101);
		Supplier supplier = new Supplier(104, "patanjali", "mumbai", 20, 112, 20, 101);
		Goods goods = new Goods(1002, "kitkat", 12, 30, 104);
		Retailer retail = new Retailer(101, "Dmart", "Mumbai");

		System.out.println(customerService.addCustomer(customer));
		System.out.println(retailerService.viewCustomer());

	}
}