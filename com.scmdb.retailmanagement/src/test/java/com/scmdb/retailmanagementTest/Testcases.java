package com.scmdb.retailmanagementTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
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

public class Testcases {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	final CustomerService customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
    final SupplierService supplierService=ctx.getBean("supplierService",SupplierServiceImpl.class);
    final GoodsService goodsService=ctx.getBean("goodsService",GoodsServiceImpl.class);
	final RetailerService retailerService= ctx.getBean("retailerService",RetailerServiceImpl.class);

	Customer customer = new Customer(401, "Tuhin", "Wb", "credit", 101);
	Supplier supplier=new Supplier(504,"patanjali","mumbai",20,112,20,101);
	Goods goods=new Goods(6002,"kitkat",12,30,104);
	Retailer retail=new Retailer(101,"Dmart","Mumbai");
	
	@org.junit.Test
	public void addCustomerTest() {
		Customer customer1 = new Customer(801, "Tuhin", "Wb", "credit", 101);
		int value=customerService.addCustomer(customer1);
		assertEquals(801, value);
	}
	
	@Test 
	public void deleteCustomerTest()
	{
		long value=customerService.removeCustomer(106);
		assertEquals(1, value);
}

  @Test
public void updateCustomer()
{
   
	Customer customer=new Customer(107,"Arati","moheshpur","debit",103);
	customerService.addCustomer(customer);
	long value=customerService.updateCustomer("CASHU", 107);
	assertEquals(1, value);
}

@Test
public void addSupplier()
{
	Supplier supplier=new Supplier(304,"patanjali","mumbai",20,112,20,101);
   long value=supplierService.addSupplier(supplier);
   assertEquals(304,value);
 }

 @Test
public void updateSupplier()
{
  long value= supplierService.updateSupplier(105, 180);
   assertEquals(1,value);
}

@Test
public void deleteSupplier() {
	Supplier supplier1=new Supplier(308,"patanjali","mumbai",20,112,20,101);
	   supplierService.addSupplier(supplier1);
   long value=supplierService.removeSupplier(308);
  assertEquals(1,value);
     }

 @Test
public void addGoods()
{
   long value=goodsService.addGoods(goods);
   assertEquals(6002,value);
}

@Test
public void removeGoods()
{
	Goods goods1=new Goods(3002,"kitkat",12,30,104);
	goodsService.addGoods(goods1);
  long value=goodsService.removeGoods(2002);
   assertEquals(1,value);
}

 
@Test
public void updateGoods() {
   long value=goodsService.updategoods(1002, 80);
   assertEquals(1,value);
}

}
