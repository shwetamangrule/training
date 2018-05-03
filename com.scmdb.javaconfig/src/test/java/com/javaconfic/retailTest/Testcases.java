package com.javaconfic.retailTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controller.controller;
import model.Customer;

public class Testcases {

	controller cntrl=new controller();
	
	@org.junit.Test
	public void addCustomerTest() {
				assertEquals(221, cntrl.addCustomerControl());
	}
	@Test 
	public void deleteCustomerTest()
	{
		assertEquals(1, cntrl.deleteCustomerControl());
}

  @Test
public void updateCustomer()
{
   	assertEquals(1, cntrl.updateCustomerControl());
}
@Test
public void addSupplier()
{
	 
   assertEquals(311,cntrl.addSupplierControl());
 }

  @Test
public void updateSupplier()
{
 ;
   assertEquals(1,cntrl.updateSupplierControl());
}

@Test
public void deleteSupplier() {
      assertEquals(1,cntrl.deleteSupplierControl());
      }

 @Test
public void addGoods()
{
	
   assertEquals(411,cntrl.addGoodsControl());
}

@Test
public void removeGoods()
{
     assertEquals(1,cntrl.removeGoodsControl());
}

  
@Test
public void updateGoods() {
  
   assertEquals(1,cntrl.updateGoodsControl());
   
}

    @Test
    public void viewgoods()
    {
   	    assertEquals(1, cntrl.viewgoodsControl());
    }
    
    @Test
    public void viewCustomer()
    {
    	assertEquals(1, cntrl.viewCustomer());
    }
    @Test
    public void viewSupplier()
    {
    	assertEquals(1, cntrl.viewSupplier());
    }
}
