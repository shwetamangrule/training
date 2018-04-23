package controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repo.CustomerRepo;
public class CustomerControl {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CustomerRepo obj = (CustomerRepo) context.getBean("CustCntrl");
	      obj.addName();
	}

}
