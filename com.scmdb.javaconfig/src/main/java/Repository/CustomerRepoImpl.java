package Repository;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Customer;

public class CustomerRepoImpl implements CustomerRepo {

	JdbcTemplate jdbcTemplate;
	
	public CustomerRepoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int addCustomer(Customer customer) {

		String query = "INSERT INTO customer VALUES('" + customer.getCustomerId() + "','" + customer.getCustomerName()
				+ "','" + customer.getCustomerAddress() + "','" + customer.getPaymentMode() + "','"
				+ customer.getRetailerId() + "')";

		jdbcTemplate.update(query);
		return customer.getCustomerId();
	}
	@Override
	public int removeCustomer(int customerId) {
		String query="DELETE FROM customer WHERE customer_id='" + customerId + "'";
		return jdbcTemplate.update(query);
	}
	@Override
	public int updateCustomer(String paymentMode, int customerId) {

		String query = "UPDATE customer SET payment_mode='" + paymentMode + "' WHERE customer_id='" + customerId + "'";
		return jdbcTemplate.update(query);

	}
}