package Service;

import Repository.SupplierRepo;
import model.Supplier;

public class SupplierServiceImpl implements SupplierService{

     SupplierRepo supplierRepo;

     
	public SupplierServiceImpl(SupplierRepo supplierRepo) {

		super();
		this.supplierRepo = supplierRepo;
	}
     @Override
	public int addSupplier(Supplier supplier) {

		return supplierRepo.addSupplier(supplier);
	}
	
	@Override
	public int updateSupplier(int supplierId, float amount) {

		return supplierRepo.updateSupplier(supplierId, amount);

		}
	@Override
	public int removeSupplier(int supplierId) {

		return supplierRepo.removeSupplier(supplierId);
	}
	
}