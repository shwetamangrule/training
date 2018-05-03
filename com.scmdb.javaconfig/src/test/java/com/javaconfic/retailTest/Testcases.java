package com.javaconfic.retailTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
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
import controller.ConfigApp;
import model.Customer;
import model.Goods;
import model.Supplier;

public class Testcases {

	 ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
	 
	final CustomerService customerService = ctx.getBean("CustomerService", CustomerServiceImpl.class);
    final SupplierService supplierService=ctx.getBean("SupplierService",SupplierServiceImpl.class);
    final GoodsService goodsService=ctx.getBean("GoodsService",GoodsServiceImpl.class);
    final RetailerService retailerService=ctx.getBean("RetailerService",RetailerServiceImpl.class);

	@org.junit.Test
	public void addCustomerTest() {
		Customer customer = new Customer(221, "Tuhin", "Wb", "credit", 101);
		Customer customer1 = new Customer(222, "Sukumar", "Wb", "credit", 101);
		customerService.addCustomer(customer1);
		int value=customerService.addCustomer(customer);
		assertEquals(221, value);
	}
	@Test 
	public void deleteCustomerTest()
	{
		long value=customerService.removeCustomer(222);
		assertEquals(1, value);
}

  @Test
public void updateCustomer()
{
   
	Customer customer=new Customer(223,"Arati","moheshpur","debit",101);
	customerService.addCustomer(customer);
	long value=customerService.updateCustomer("cash", 223);
	assertEquals(1, value);
}

@Test
public void addSupplier()
{
	Supplier supplier=new Supplier(311,"patanjali","mumbai",20,112,20,101);
	Supplier supplier1=new Supplier(312,"gobordhan","mumbai",30,112,40,101);
	supplierService.addSupplier(supplier1);
   long value=supplierService.addSupplier(supplier);
   assertEquals(311,value);
 }

  @Test
public void updateSupplier()
{
  long value= supplierService.updateSupplier(312, 50);
   assertEquals(1,value);
}

@Test
public void deleteSupplier() {
   
   assertEquals(1,supplierService.removeSupplier(312));
      }

 @Test
public void addGoods()
{
	 Goods goods=new Goods(411,"kitkat",12,30,301);
	 Goods goods1=new Goods(412,"kurkure",12,40,301);
	 goodsService.addGoods(goods1);
   long value=goodsService.addGoods(goods);
   assertEquals(411,value);
}

@Test
public void removeGoods()
{
   long value=goodsService.removeGoods(411);
   assertEquals(1,value);
}

  
@Test
public void updateGoods() {
   long value=goodsService.updategoods(412, 50);
   assertEquals(1,value);
   
}

    @Test
    public void viewgoods()
    {
   	List<Goods> goodslist= retailerService.viewGoods();
    assertTrue(goodslist.contains(goodslist.get(0)) );
    }
    
    @Test
    public void viewCustomer()
    {
   	List<Customer> customerlist= retailerService.viewCustomer();
    assertTrue(customerlist.contains(customerlist.get(1)) );
    }
    @Test
    public void viewSupplier()
    {
   	List<Supplier> viewsupplier= retailerService.viewSupplier();
    assertTrue(viewsupplier.contains(viewsupplier.get(1)) );
    }
}
