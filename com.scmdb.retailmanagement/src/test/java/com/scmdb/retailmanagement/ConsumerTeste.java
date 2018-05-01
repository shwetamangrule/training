package com.scmdb.retailmanagement;
import static org.junit.Assert.assertEquals;

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
import model.Supplier;

public class ConsumerTeste {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	final CustomerService customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
    final SupplierService supplierService=ctx.getBean("supplierService",SupplierServiceImpl.class);
    final GoodsService goodsService=ctx.getBean("goodsService",GoodsServiceImpl.class);
	final RetailerService retailerService= ctx.getBean("retailerService",RetailerServiceImpl.class);

	Customer customer = new Customer(101, "Tuhin", "Wb", "credit", 101);
	Supplier supplier=new Supplier(104,"patanjali","mumbai",20,112,20,102);
	Goods goods=new Goods(1002,"kitkat",12,30,101);
	
	//@Test
	public void addCustomerTest() {
		
		int value=customerService.addCustomer(customer);
		assertEquals(101, value);
	}
	
	//@Test 
	public void deleteCustomerTest()
	{
		long value=customerService.removeCustomer(101);
		assertEquals(101, value);
}

//  @Test
public void updateCustomer()
{
   
	Customer customer=new Customer(102,"Arati","moheshpur","debit",103);
	customerService.addCustomer(customer);
	long value=customerService.updateCustomer("credit", 102);
	assertEquals(1, value);
}

//@Test
public void addSupplier()
{
   long value=supplierService.addSupplier(supplier);
   assertEquals(104,value);
 }

//  @Test
public void updateSupplier()
{
  long value= supplierService.updateSupplier(101, 40);
   assertEquals(1,value);
}

//@Test
public void deleteSupplier() {
   long value=supplierService.removeSupplier(102);
   assertEquals(1,value);

      

}
// @Test
public void addGoods()
{
   long value=goodsService.addGoods(goods);
   assertEquals(1002,value);
}

//@Test
public void removeGoods()
{
   long value=goodsService.removeGoods(1001);
   assertEquals(1,value);
}

//  @Test
public void updateGoods() {
   long value=goodsService.updategoods(1002, 40);
   assertEquals(1,value);
}

}
