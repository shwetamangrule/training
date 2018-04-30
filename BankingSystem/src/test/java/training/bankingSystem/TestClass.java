package training.bankingSystem;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.bank.model.Address;
import com.bank.model.Bank;
import com.bank.model.Contact;
import com.bank.model.Customer;
import com.bank.repository.AccountRepo;
import com.bank.repository.AccountRepoImpl;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImpl;


/**
 * @author trainee
 *
 */
public class TestClass {

	final AccountService service = new AccountServiceImpl();
	final Contact contact = new Contact("234324", "56767", "abc@gmail.com");
	final Address address = new Address("asd", "13", "asd", "delhi");
	final Bank bank=new Bank();
	final Customer customer = new Customer("1","tuhin", "das", 2000,address,contact,bank);
	final AccountRepo account = new AccountRepoImpl();
//	@Test
//	public void bankTest() {
//	
//		final Map<String, Customer> map = bank.getMap();
//		service.addCustomer(customer);
//		assertEquals(0, map.size());
//	
//		
//	}
//
//		
//		@Test
//		public void bankWithdraw()
//		{
//			//System.out.println(customer.getCurrentBalance());
//			service.withdraw(200);
//			assertTrue(service.withdraw(200)==1800);
//			
//		}
//		
//		@Test
//		public void bankDeposit()
//		{
//			
//			//System.out.println(customer.getCurrentBalance());
//			float a=service.deposit(200);
//			System.out.println(a);
//			assertTrue(service.getBalance()==2200);
//			//assertTrue(service.getBalance()==1800);
//		}
//
//		@Test
//		public void bankWithdraw1()
//		{
//			//System.out.println(customer.getCurrentBalance());
//			service.withdraw(200);
//			assertFalse(service.getBalance()==1200);
//			
//		}
		
		@Test
		public void bankDeposit1()
		{
			//float deposit=100;
			//service.deposit(100);
			assertFalse((service.deposit(100))==2000);
			//assertTrue(service.getBalance()==1800);
		}
	
}