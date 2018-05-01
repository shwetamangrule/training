package Repository;

import java.util.List;

import model.Customer;
import model.Goods;
import model.Supplier;

public interface RetailerRepo {

	public List<Goods> viewGoods();
	public List<Customer> viewCustomer();
	public List<Supplier> viewSupplier();

}