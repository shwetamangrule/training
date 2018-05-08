package Service;

import java.util.List;

import model.Customer;
import model.Goods;
import model.Supplier;
/*
 * retailer seervice logic
 */
public interface RetailerService {

	public List<Goods> viewGoods();
	public List<Customer> viewCustomer();
	public List<Supplier> viewSupplier();

}