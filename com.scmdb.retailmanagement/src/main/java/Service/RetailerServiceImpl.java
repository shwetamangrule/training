package Service;

import java.util.List;

import Repository.RetailerRepo;
import model.Customer;
import model.Goods;
import model.Supplier;

public class RetailerServiceImpl implements RetailerService{

	public RetailerRepo retailerRepo;
	public RetailerServiceImpl(RetailerRepo retailerRepo) {
		super();
		this.retailerRepo = retailerRepo;
	}
	
	@Override
	public List<Goods> viewGoods() {
		return retailerRepo.viewGoods();
	}
	
	@Override
	public List<Customer> viewCustomer() {
		return retailerRepo.viewCustomer();
	}
	
	@Override
	public List<Supplier> viewSupplier() {

			return retailerRepo.viewSupplier();
	}



	



}