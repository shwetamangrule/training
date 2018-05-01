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

public class ConsumerTest {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	final CustomerService customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
    final SupplierService supplierService=ctx.getBean("supplierService",SupplierServiceImpl.class);
    final GoodsService goodsService=ctx.getBean("goodsService",GoodsServiceImpl.class);
	final RetailerService retailerService= ctx.getBean("retailerService",RetailerServiceImpl.class);

    //@Test

	public void addCustomer() {

		Customer customer = new Customer(101, "sona", "chennai", "credit", 101);
		int value=customerService.addCustomer(customer);
		//assertEquals(101, value);
		assertEquals(101, value);
	}

	
//
////	@Test 
//
//	public void deleteCustomer()
//
//	{
//
//		Customer customer=new Customer(1,"Pooja","mumbai","debit","R1");
//
//		long value=customerService.removeCustomer(1);
//
//        assertEquals(1, value);
//
//	}
//
// //  @Test
//
//   public void updateCustomer()
//
//   {
//
//	   Customer customer=new Customer(2,"Pooja","mumbai","debit","R1");
//
//	   //customer.setPaymentMode("credit");
//
//	  long value=customerService.updateCustomer("credit", 1);
//
//	   assertEquals(1, value);
//
//   }
//
//   
//
//   //@Test
//
//   public void addSupplier()
//
//   {
//
//	   Supplier supplier=new Supplier(104,"Sonam","Chennai",20,112,20,"R2");
//
//	   long value=supplierService.addSupplier(supplier);
//
//	   assertEquals(104,value);
//
//	   
//
//   }
//
//   
//
// //  @Test
//
//   public void updateSupplier()
//
//   {
//
//	  long value= supplierService.updateSupplier(101, 40);
//
//	   assertEquals(1,value);
//
//   }
//
//   
//
//   //@Test
//
//   public void deleteSupplier() {
//
//	   long value=supplierService.deleteSupplier(102);
//
//	   assertEquals(1,value);
//
//	      
//
//   }
//
//  // @Test
//
//   public void addGoods()
//
//   {
//
//	   Goods goods=new Goods(1002,"kitkat",12,30,101);
//
//	   long value=goodsService.addGoods(goods);
//
//	   assertEquals(1002,value);
//
//   }
//
//   
//
//   //@Test
//
//   public void removeGoods()
//
//   {
//
//	   long value=goodsService.removeGoods(1001);
//
//	   assertEquals(1,value);
//
//   }
//
//   
//
// //  @Test
//
//   public void updateGoods() {
//
//	   long value=goodsService.update(1002, 40);
//
//	   assertEquals(1,value);
//
//   }

}