package com.customer.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class controller {

	public static void main(String[] args) {

		ApplicationContext appContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		

	}

}
