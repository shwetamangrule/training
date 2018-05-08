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
	/*
	 * (non-Javadoc)
	 * @see Service.RetailerService#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {
		return retailerRepo.viewGoods();
	}
	/*
	 * (non-Javadoc)
	 * @see Service.RetailerService#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {
		return retailerRepo.viewCustomer();
	}
	/*
	 * (non-Javadoc)
	 * @see Service.RetailerService#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

			return retailerRepo.viewSupplier();
	}



	



}