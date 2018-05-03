package controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
import model.Supplier;

public class controller {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);

	final CustomerService customerService = ctx.getBean("CustomerService", CustomerServiceImpl.class);
	final SupplierService supplierService = ctx.getBean("SupplierService", SupplierServiceImpl.class);
	final GoodsService goodsService = ctx.getBean("GoodsService", GoodsServiceImpl.class);
	final RetailerService retailerService = ctx.getBean("RetailerService", RetailerServiceImpl.class);

	public int addCustomerControl() {
		Customer customer = new Customer(261, "Tuhin", "Wb", "credit", 101);
		Customer customer1 = new Customer(262, "Sukumar", "Wb", "credit", 101);
		customerService.addCustomer(customer1);
		return customerService.addCustomer(customer);
		}

	public int deleteCustomerControl() {
	 return customerService.removeCustomer(262);
	}

	public int updateCustomerControl() {
		Customer customer = new Customer(263, "Arati", "moheshpur", "debit", 101);
		customerService.addCustomer(customer);
		return customerService.updateCustomer("cash", 263);
	}

	public int addSupplierControl() {
		Supplier supplier = new Supplier(361, "patanjali", "mumbai", 20, 112, 20, 101);
		Supplier supplier1 = new Supplier(362, "gobordhan", "mumbai", 30, 112, 40, 101);
		supplierService.addSupplier(supplier1);
		return supplierService.addSupplier(supplier);
	
	}

	public int updateSupplierControl() {
		return supplierService.updateSupplier(362, 50);
	}

	public int deleteSupplierControl() {
		return supplierService.removeSupplier(361);
	}

	public int addGoodsControl() {
		Goods goods = new Goods(461, "kitkat", 12, 30, 301);
		Goods goods1 = new Goods(462, "kurkure", 12, 40, 301);
		goodsService.addGoods(goods1);
		return goodsService.addGoods(goods);
	}

	public int removeGoodsControl() {
		return goodsService.removeGoods(461);

	}

	public int updateGoodsControl() {
		return goodsService.updategoods(462, 50);
	}

	public int viewgoodsControl() {
		List<Goods> goodslist = retailerService.viewGoods();
		return 1;
	}

	public int viewCustomer() {
		List<Customer> customerlist = retailerService.viewCustomer();
		return 1;
	}
	public int viewSupplier() {
		List<Supplier> viewsupplier = retailerService.viewSupplier();
		return 1;
	}

}
