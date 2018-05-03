package Repository;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Customer;
import model.Goods;
import model.Supplier;

public class RetailerRepoImpl implements RetailerRepo {

	JdbcTemplate jdbcTemplate;
/*
 * jdbc template for creating connections
 */
	public RetailerRepoImpl(JdbcTemplate jdbcTemplate) {
		
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.RetailerRepo#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {

		List<Goods> goodslist = jdbcTemplate
				.query("SELECT * from goods",new BeanPropertyRowMapper<Goods>(Goods.class));
		return goodslist;
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.RetailerRepo#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {

		List<Customer> customerlist = jdbcTemplate.query("SELECT * from customer",new BeanPropertyRowMapper<Customer>(Customer.class));
		return customerlist;
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.RetailerRepo#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

		List<Supplier> supplierlist = jdbcTemplate.query("SELECT * FROM supplier",new BeanPropertyRowMapper<Supplier>(Supplier.class));

		return supplierlist;

	}



}