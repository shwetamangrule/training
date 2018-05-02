package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Service.CustomerService;
import Service.GoodsService;
import Service.SupplierService;
import Service.SupplierServiceImpl;
import model.Customer;
import model.Goods;
import model.Supplier;

public class controller {

	public static void main(String[] args) {

		 ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
	      	
			CustomerService custService = (CustomerService) context.getBean("CustomerService");
			Customer customer = new Customer(106, "TuhinDas", "Wb", "credit", 101);
			System.out.println(custService.addCustomer(customer));
			
			Goods goods=new Goods(1003,"MangoBite",12,30,104);
			GoodsService goodsService=(GoodsService) context.getBean("GoodsService");
			System.out.println(goodsService.addGoods(goods));
		 
		 SupplierService supplierService=(SupplierServiceImpl)context.getBean("SupplierService");
		 Supplier supplier=new Supplier(105,"lol","chennai",20,112,20,103);
		 System.out.println(supplierService.addSupplier(supplier));
	}

}
