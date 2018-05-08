package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.cg.exception.StoreException;

import Service.CustomerService;
import Service.RetailerService;
import model.Customer;

/**
 * Servlet implementation class StoreController
 */
@WebServlet("/StoreController")
public class StoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigApp.class);
	
	CustomerService custService = (CustomerService) context.getBean("CustomerService");
	RetailerService retailerService = (RetailerService) context.getBean("RetailerService");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qStr= request.getParameter("action");
		System.out.println("IN GET" +qStr);
		
			RequestDispatcher dispatch=null;

			if("addCustomer".equals(qStr))
			{
				 dispatch=request.getRequestDispatcher("addNew.jsp");
					dispatch.forward(request, response);
		

				
			}
		if("viewAllCustomer".equals(qStr))
		 {
				List<Customer> list=retailerService.viewCustomer();
				request.setAttribute("listCustomer", list);
				dispatch=request.getRequestDispatcher("home.jsp");
				dispatch.forward(request, response);
			} 
			
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IN POST");
		String str3 = request.getParameter("CustomGDDFG");
	
		String str4 = request.getParameter("customer_Name");
		String str5 = request.getParameter("customer_Address");
		String str6 = request.getParameter("payment_Mode");
		String str7 = request.getParameter("retailer_id");
		System.out.println(str3);
		System.out.println(str5);
		Customer cust1=new Customer(str3,str4,str5,str6,str7);
		
		String str10 = custService.addCustomer(cust1);
		System.out.println(str10);
		request.getRequestDispatcher("error.jsp").forward(request, response);
		
		//doGet(request, response);
	}

}
