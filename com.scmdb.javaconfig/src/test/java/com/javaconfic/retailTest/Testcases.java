package com.javaconfic.retailTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Service.CustomerService;
import Service.CustomerServiceImpl;
import Service.GoodsService;
import Service.GoodsServiceImpl;
import Service.SupplierService;
import Service.SupplierServiceImpl;
import controller.ConfigApp;
import model.Customer;
import model.Goods;
import model.Supplier;

public class Testcases {

	 ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
	 
	final CustomerService customerService = ctx.getBean("CustomerService", CustomerServiceImpl.class);
    final SupplierService supplierService=ctx.getBean("SupplierService",SupplierServiceImpl.class);
    final GoodsService goodsService=ctx.getBean("GoodsService",GoodsServiceImpl.class);
	//final RetailerService retailerService= ctx.getBean("retailerService",RetailerServiceImpl.class);

	
	
	
	//Retailer retail=new Retailer(101,"Dmart","Mumbai");
	
	@org.junit.Test
	public void addCustomerTest() {
		
		Customer customer = new Customer(201, "Tuhin", "Wb", "credit", 101);
		Customer customer1 = new Customer(202, "Sukumar", "Wb", "credit", 101);
		customerService.addCustomer(customer1);
		int value=customerService.addCustomer(customer);
		assertEquals(201, value);
		
	}
	
	@Test 
	public void deleteCustomerTest()
	{
		long value=customerService.removeCustomer(201);
		assertEquals(1, value);
}

  @Test
public void updateCustomer()
{
   
	Customer customer=new Customer(203,"Arati","moheshpur","debit",101);
	customerService.addCustomer(customer);
	long value=customerService.updateCustomer("cash", 202);
	assertEquals(1, value);
}

@Test
public void addSupplier()
{
	Supplier supplier=new Supplier(301,"patanjali","mumbai",20,112,20,101);
	Supplier supplier1=new Supplier(302,"gobordhan","mumbai",30,112,40,101);
	supplierService.addSupplier(supplier1);
   long value=supplierService.addSupplier(supplier);
   assertEquals(301,value);
 }

  @Test
public void updateSupplier()
{
  long value= supplierService.updateSupplier(302, 50);
   assertEquals(1,value);
}

@Test
public void deleteSupplier() {
   long value=supplierService.removeSupplier(302);
   assertEquals(1,value);
      }

 @Test
public void addGoods()
{
	 Goods goods=new Goods(401,"kitkat",12,30,301);
	 Goods goods1=new Goods(402,"kurkure",12,40,301);
	 goodsService.addGoods(goods1);
   long value=goodsService.addGoods(goods);
   assertEquals(401,value);
}

@Test
public void removeGoods()
{
   long value=goodsService.removeGoods(402);
   assertEquals(1,value);
}

  
@Test
public void updateGoods() {
   long value=goodsService.updategoods(401, 40);
   assertEquals(1,value);
}

}
